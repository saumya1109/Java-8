package TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {
    public static void main(String[] args) {

        System.out.println(sumExample());
        System.out.println(averageExample());

    }

    public static int sumExample(){
        return  StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double averageExample(){
        return  StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNoteBooks));
    }
}

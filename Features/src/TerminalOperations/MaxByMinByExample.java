package TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MaxByMinByExample {
    public static void main(String[] args) {
        System.out.println(minByExample());
        System.out.println(maxByExample());
        
    }

    public static Optional<Student> minByExample(){
      return  StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExample(){
        return  StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
}

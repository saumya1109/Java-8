package TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static void main(String[] args) {
        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());

    }

    public static String joining1(){
        //Joining returns String
      return  StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining2(){
        //Joining with delimiter
        return  StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining3(){
        //Joining with delimiter
        return  StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(" , ")"));
    }
}

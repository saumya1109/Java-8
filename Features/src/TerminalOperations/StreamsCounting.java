package TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamsCounting {
    public static void main(String[] args) {
        System.out.println(count());

    }

    public static long count(){
        //Joining with delimiter
        return  StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGpa()>=3.9))
                .collect(counting());
    }
}


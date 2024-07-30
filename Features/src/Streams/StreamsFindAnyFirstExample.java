package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static void main(String[] args) {
        System.out.println(findAnyStududent().get());
        System.out.println(findFirstStududent().get());


    }

    public static Optional<Student> findAnyStududent(){
       return  StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStududent(){
        return  StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
}

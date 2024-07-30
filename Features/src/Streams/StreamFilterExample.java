package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        getFemales().forEach(System.out::println);

    }

    public static List<Student> getFemales(){
        //Filter accepts a predicate
       return StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }
}

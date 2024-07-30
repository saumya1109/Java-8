package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        // the map method is used to convert from one type to another type
        System.out.println(namesList());
        System.out.println(namesSet());
    }


    public static List<String> namesList (){

      return   StudentDataBase.getAllStudents().stream()
                //Student as input --> Student Name
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> namesSet (){

        return   StudentDataBase.getAllStudents().stream()
                //Student as input --> Student Name
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }
}

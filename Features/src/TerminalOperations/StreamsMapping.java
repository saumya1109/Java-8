package TerminalOperations;

import Data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMapping {
    public static void main(String[] args) {
        System.out.println(mappingTolist());
        System.out.println(mappingToSet());

    }

    public static List<String> mappingTolist(){
        return StudentDataBase.getAllStudents().stream()
                .collect(mapping((student)-> student.getName(), toList()));
    }

    public static Set<String> mappingToSet(){
        return StudentDataBase.getAllStudents().stream()
                .collect(mapping((student)-> student.getName(),toSet()));
    }
}

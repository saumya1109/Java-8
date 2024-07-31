package TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartioningByExample {
    public static void main(String[] args) {
        partioningBy_1();
        partioningBy_2();

    }

    public static void partioningBy_1(){

        //PartitioningBy accepts Predicate
        Predicate<Student>  predicate = (student -> student.getGpa()>=3.8);

       Map<Boolean, List<Student>> map= StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predicate));

        System.out.println(map);

    }

    public static void partioningBy_2(){

        //PartitioningBy accepts Predicate
        Predicate<Student>  predicate = (student -> student.getGpa()>=3.8);

        Map<Boolean, Set<Student>> set= StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(predicate, toSet()));

        System.out.println(set);
    }
}

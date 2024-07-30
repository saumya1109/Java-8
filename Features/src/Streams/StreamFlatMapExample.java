package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        System.out.println(listOfActivities());
        System.out.println(distinctListOfActivities());
        System.out.println(countListOfActivities());
        System.out.println(countDistinctListOfActivities());
        System.out.println(sortedListOfActivities());

    }

    public static List<String> listOfActivities() {
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());

        return list;
    }

    public static List<String> distinctListOfActivities() {
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() //Stream<String> --> with distinct
                .collect(toList());

        return list;
    }

    public static long countListOfActivities() {
         return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();
    }

    public static long countDistinctListOfActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static List<String> sortedListOfActivities() {
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()//Stream<String> --> with distinct
                .sorted()
                .collect(toList());

        return list;
    }

}

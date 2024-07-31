package TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
        System.out.println(groupStudentsByGender());
        System.out.println(groupStudentsByCustom());

        //Takes 2 parameters
        System.out.println(twoLevelGrouping_1());
        System.out.println(twoLevelGrouping_2());

        //Three parameters group by   (Key , Output ,Value for output)
        System.out.println(threeArgumentGroupBy());

        System.out.println(calculteTopGpa());
        System.out.println(calculteToGpaWithoutOptional());

        System.out.println(calculteLeastGpa());

    }

    public static Map<String, List<Student>> groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        return studentMap;
    }

    public static Map<String, List<Student>> groupStudentsByCustom() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "outstanding" : "Average"));
        return studentMap;
    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.8 ? "outstanding" : "Average")));

        return studentMap;

    }

    public static Map<Integer, Integer> twoLevelGrouping_2() {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)));

        return studentMap;

    }

    public static Map<String, Set<Student>> threeArgumentGroupBy() {
        Map<String, Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        return studentMap;

    }

    public static Map<Integer, Optional<Student>> calculteTopGpa() {
       return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student:: getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));



    }

    public static Map<Integer, Student> calculteToGpaWithoutOptional() {
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student:: getGradeLevel,
                       collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional:: get)));



    }

    public static Map<Integer, Optional<Student>> calculteLeastGpa() {
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student:: getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));



    }
}

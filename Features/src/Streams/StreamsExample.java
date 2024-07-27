package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        Predicate<Student> studentPredicate= (student) -> student.getGradeLevel() >= 3;
        Predicate<Student> studentPredicateGPA= (student) -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentPredicate)
                .filter(studentPredicateGPA)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}

package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static void main(String[] args) {
        System.out.println("Sorted By Name" + getStudentsSortedByName());
        System.out.println("Another Method"  +studentNameComparator());

        getStudentsSortedByGPA().forEach(System.out::println);
        System.out.println(getStudentsSortedByGpaDesc());


    }

    public static List<Student> getStudentsSortedByName() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentsSortedByGPA() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentsSortedByGpaDesc() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }


    public static List<Student> studentNameComparator() {

        Comparator<Student> comp = (s1, s2) -> s1.getName().compareTo(s2.getName());

        return StudentDataBase.getAllStudents().stream()
                .sorted(comp)
                .collect(Collectors.toList());
    }
}

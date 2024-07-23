package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;


    public static void main(String[] args) {
        filterStdentByGradeLevel();
        System.out.println();
        filterStdentByGPA();
        System.out.println();
        filterStdentByGradeLevelAndGPA();
        System.out.println();
        filterStdentByGradeLevelOrGPA();

    }

    public static void filterStdentByGradeLevel() {

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        }));

    }

    public static void filterStdentByGPA() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStdentByGradeLevelAndGPA() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }
    public static void filterStdentByGradeLevelOrGPA() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.or(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }
}

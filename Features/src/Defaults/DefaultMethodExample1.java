package Defaults;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample1 {
    public static void main(String[] args) {
        Consumer<Student> student = (s) -> System.out.println(s);
        List<Student> studentList = StudentDataBase.getAllStudents();

        //Will push null values at the front
        sortWithNullFirst(studentList).forEach(student);
        System.out.println();

        //Will push null values at the last
        sortWithNullLast(studentList).forEach(student);

        //sortByName
        sortByName(studentList).forEach(student);
        System.out.println();
        //sortByGpa
        sortByGpa(studentList).forEach(student);
        System.out.println();
        //sortByGradeAndThenName
        sortByGradeAndThenName(studentList).forEach(student);

    }

    public static List<Student> sortByName(List<Student> studentList) {
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        return studentList;
    }

    public static List<Student> sortByGpa(List<Student> studentList) {
        Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
        studentList.sort(gpaComparator);
        return studentList;
    }

    public static List<Student> sortByGradeAndThenName(List<Student> studentList) {
        Comparator<Student> gradeAndThenName = Comparator.comparing(Student::getGradeLevel).thenComparing(Student::getName);

        studentList.sort(gradeAndThenName);
        return studentList;
    }

    //Comparator will throw null pointer exeption if there are null value in the list to be sorted

    public static List<Student> sortWithNullFirst(List<Student> studentList) {
        //sort by name
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        return studentList;
    }

    public static List<Student> sortWithNullLast(List<Student> studentList) {
        //sort by name
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        return studentList;
    }
}

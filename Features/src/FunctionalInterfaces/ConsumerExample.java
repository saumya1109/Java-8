package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c3 = (student) -> System.out.println(student);
    static Consumer<Student> c4 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c5 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        introToConsumer();
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    public static void introToConsumer() {
    /* -Consumer interface is a functional interface
       -accepts a single input argument and returns no result.
       -used for operations that consume a value and perform some action,
       -such as printing a value, modifying an object, or logging information.

       -Requires Type parameters:
           -<T> – the type of the input to the operation

      -has two method
        -accepts -- abstract method
        -andThen -- default
    * */
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        Consumer<String> c2 = (s) -> System.out.println(s.length());
        c1.andThen(c2).accept("learn java 8");   // Consumer Chaining

    }

    public static void printName() {
        List<Student> students = StudentDataBase.getAllStudents();

        /* forEach(c3) iterates over each Student in the students list
        and applies the c3.accept(student) method to each Student*/

        /*
            Using the accept method directly
            for (Student student : students) {
                c3.accept(student);
            }
            */
        students.forEach(c3);
    }

    public static void printNameAndActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c4.andThen(c5));

    }
    public static void printNameAndActivitiesUsingCondition() {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("\n Using Condition");
        students.forEach((student) -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
                c4.andThen(c5).accept(student);
            }
        });

    }
}

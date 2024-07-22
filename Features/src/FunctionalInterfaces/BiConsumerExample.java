package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        introToBiconsumer();
        biConsumerChaining();
        printNameAndActivities();


    }

    public static void introToBiconsumer() {
    /*
    Biconsumer is also a functional interface
    BiConsumer<T, U> which accepts two parameters
    */
        BiConsumer<String, String> b1 = (a, b) -> {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        };

        b1.accept("java7", "java8");
    }

    public static void biConsumerChaining() {
        BiConsumer<Integer, Integer> b1 = (a, b) -> {
            System.out.println(a * b);
        };

        BiConsumer<Integer, Integer> b2 = (a, b) -> {
            System.out.println(a / b);
        };

        b1.andThen(b2).accept(10, 5);

    }

    public static void printNameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + ": " + activities);
        };

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student) -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });
    }

}

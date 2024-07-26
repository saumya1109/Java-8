package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {


    public static void main(String[] args) {
        introToBiFunction();
        System.out.println(biFunctionExample());
    }

    public static void introToBiFunction() {
        /* BiFunction<T, U, R> takes two input and returns an output
            <T> – the type of the first argument to the function
            <U> – the type of the second argument to the function
            <R> – the type of the result of the function
        *
        * // has an abstract ,method apply and default method andThen
        * */

        BiFunction<String, String, Integer> b1 = (s1, s2) -> {
            int maxLength = (s1.length() > s2.length()) ? s1.length() : s2.length();
            return maxLength;
        };

        System.out.println(b1.apply("apples", "oranges"));
    }


    public static Map<String, Double> biFunctionExample() {
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
                (students, p1) -> {
                    Map<String, Double> studentMap = new HashMap<>();
                    students.forEach(
                            (student) -> {
                                if (p1.test(student)) {
                                    studentMap.put(student.getName(), student.getGpa());
                                }
                            }
                    );
                    return studentMap;
                };
        return biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1);
    }

}

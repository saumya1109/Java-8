package MethodReference;

import Data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstrctorReference {
    //would need default constructor
   static Supplier<Student> studentSupplier = Student::new;

    //would need  constructor with one parameter
   static Function<String,Student> studentFunction = Student::new;
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Sue"));
    }
}

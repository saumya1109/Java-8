package Optional;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }

    public static String optionalOrElse() {
        //Accepts String

     /*   Optional<Student> studentOptional=
                Optional.ofNullable(StudentDataBase.studentSupplier.get());*/

        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");

        return name;
    }

    public static String optionalOrElseGet() {
        //Accepts Supplier

        Optional<Student> studentOptional=
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        //  Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");

        return name;
    }

    public static String optionalOrElseThrow() {
        //Accepts Supplier
        //Throws a runtime exception

        Optional<Student> studentOptional=
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        //  Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No data"));

        return name;
    }
}

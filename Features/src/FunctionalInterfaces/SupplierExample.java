package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier =()->{
            return new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        };

        System.out.println(studentSupplier.get());


        Supplier<List<Student>> students =()->{
          return  StudentDataBase.getAllStudents();
        };

        System.out.println(students.get());
    }
}

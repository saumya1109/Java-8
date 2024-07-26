package MethodReference;

import Data.Student;
import Data.StudentDataBase;

import java.util.function.Consumer;

public class CosumerMethodReference {
    static Consumer<Student> c1= (student) -> System.out.println(student);

    //Syntax--> className::methodName
    static Consumer<Student> c2= System.out::println;

    //Syntax--> className::instanceMethodName
    static Consumer<Student> c3 =Student::printListOfActivities;

    public static void main(String[] args) {
       StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);

    }
}

package MethodReference;

import Data.Student;
import Data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {

    static Predicate<Student> p1 = RefactorMethodReference::greaterThanGradeLevel;

    public  static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}

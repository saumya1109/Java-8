package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    BiPredicate<Integer, Double> biPredicate =
            (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    Consumer<Student> studentConsumer = (student) -> {
        if(biPredicate.test( student.getGradeLevel(), student.getGpa()));
    };

    public static void main(String[] args) {
        introToBiPredicate();
        System.out.println();

        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivites(studentList);

    }

    public static void introToBiPredicate(){
        /*
        * BiPredicate<T, U> receives two inputs
        * and had one abstract function "test"
        * returns true/ false {boolean result }*/

        BiPredicate<String, String> b1 = (a,b) -> a.length()==b.length();
        System.out.println(b1.test("apples","oranges"));
        System.out.println(b1.test("apples","grapes"));

    }

    public  void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

}

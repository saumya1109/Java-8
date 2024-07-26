package FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (student)-> student.getGpa()>=3.9;
    Predicate<Student> p2= (student) -> student.getGradeLevel()>=3;


    BiConsumer<String, List<String>> studentBiConsumer =(name, activities) -> {
        System.out.println(name+ " :"+ activities);
    };

    Consumer<Student> studentConsumer = (student) -> {
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivites(studentList);

    }

    public void printNameAndActivites(List<Student> students){
    students.forEach(studentConsumer);
    }
}

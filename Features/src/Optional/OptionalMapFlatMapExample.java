package Optional;

import Data.Bike;
import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();   //--> Optional(string)
        optionalFlatMap();
    }

    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter((student) -> student.getGpa()>3.5)
                .ifPresent(student -> System.out.println(student));
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(studentOptional.isPresent()){
            Optional<String> stringOptional =
                    studentOptional.filter(student-> student.getGpa()>=3.5)
                            .map(Student::getName);

            System.out.println(stringOptional);
        }


    }

    public static void optionalFlatMap(){
        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();

        Optional<String> name= studentOptional
                .filter(student ->student.getGpa()>=3.5)
                .flatMap(Student:: getBike)
                .map(Bike::getName);

       name.ifPresent(s-> System.out.println(s));
    }

}

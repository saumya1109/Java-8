package Optional;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;


public class OptionalExample {
    public static void main(String[] args) {

        String name = getStudentName();
        String name2 = null;
        System.out.println(name.length());
        if(name2!=null)
            System.out.println(name2.length());


        //Using Optional
        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get().length());
        }
        else{
            System.out.println("No name found");
        }


    }

    public static String getStudentName(){
       Student student= StudentDataBase.studentSupplier.get();
       if(student!=null) {
           return student.getName();
       }
       return null;
     }

     public static Optional<String> getStudentNameOptional(){
      // Optional<Student> studentOptional =Optional.ofNullable(StudentDataBase.studentSupplier.get());
       Optional<Student> studentOptional =Optional.ofNullable(null); //Optional.empty

       if(studentOptional.isPresent()){
           studentOptional.get();
           return studentOptional.map(Student::getName);  //Optional<String>
       }
       return Optional.empty();    //Represents an optional object with no value
     }
}


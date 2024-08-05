package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integers));

       Optional<Integer> result =performMultiplicationWithoutIdentity(integers);

        System.out.println(result.get());
        System.out.println(result.isPresent());

        Optional<Integer> result1 =performMultiplicationWithoutIdentity(new ArrayList<>());
       // System.out.println(result1.get());  <----No value present
        System.out.println(result1.isPresent());

        //sanity check
        if(result1.isPresent()){
            System.out.println(result1.get());
        }

        Optional<Student> student = getStudentWithHighestGPA();

        if(student.isPresent()){
            System.out.println(student.get());
        }

    }

    public static int performMultiplication(List<Integer> integerList) {

        //1,3,5,7 -- from streams
        //1 * 1 = 1
        //1*3 = 3
        //3*5 = 15
        //15*7 = 105
        return integerList.stream().reduce(1, (a, b) -> a * b);
    }



    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {

        //1,3,5,7 -- from streams
        //1 * 1 = 1
        //1*3 = 3
        //3*5 = 15
        //15*7 = 105
        return integerList.stream().reduce( (a, b) -> a * b);
    }

    public static Optional<Student> getStudentWithHighestGPA() {

       return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> s1.getGpa()> s2.getGpa() ? s1 : s2);
    }
}


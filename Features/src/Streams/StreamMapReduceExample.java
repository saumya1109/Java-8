package Streams;

import Data.Student;
import Data.StudentDataBase;

public class StreamMapReduceExample {
    public static void main(String[] args) {
        System.out.println(getNumOfNoteBooks());


    }
    public static int getNumOfNoteBooks(){


        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel()>=3))
                .filter((student) -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b)-> a+b);
                .reduce(0,Integer::sum);

    }
}

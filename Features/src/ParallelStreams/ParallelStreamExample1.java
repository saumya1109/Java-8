package ParallelStreams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {
    public static void main(String[] args) {
        sequentislListOfActivities();
        parallelListOfActivities();

    }

    public static List<String> sequentislListOfActivities() {
        long startTime = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() //Stream<String> --> with distinct
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Time: "+ (endTime-startTime));

        return list;
    }

    public static List<String> parallelListOfActivities() {
        long startTime = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() //Stream<String> --> with distinct
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel Time: "+ (endTime-startTime));

        return list;
    }
}

package SolveSomeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolveSomeQuestions1 {
    public static void main(String[] args) {

        //1. Find the sum of the List if Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);  // 15
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println(numbers.stream().reduce(0,Integer::sum));

        //2.

    }
}

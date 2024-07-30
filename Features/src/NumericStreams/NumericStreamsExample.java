package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumOfNumbers(integers));
        System.out.println(sumOfNumbersUsingIntstream());

        System.out.println(sumOfNumbersUsingIntstreamUsingInput(integers));
    }



    public static int sumOfNumbers(List<Integer> integers){
        return integers.stream()
                .reduce(0,(a,b)->(a+b)); // unboxing from Integer to int to perform the expression

    }

    public static int sumOfNumbersUsingIntstream(){
      return  IntStream.rangeClosed(1,6)
                .sum();

    }
    public static int sumOfNumbersUsingIntstreamUsingInput(List<Integer> integers){
        return integers.stream()
                .mapToInt(Integer::intValue)
                .sum();

    }
}

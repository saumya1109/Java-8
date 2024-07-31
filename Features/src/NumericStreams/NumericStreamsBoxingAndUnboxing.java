package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingAndUnboxing {
    public static void main(String[] args) {
       List<Integer> list = boxing();
       list.forEach((a)-> System.out.print(a+ ","));

        System.out.println();
        System.out.println(unBoxing(list));



    }
    public static List<Integer> boxing(){
     return   IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integers){
        return   integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}

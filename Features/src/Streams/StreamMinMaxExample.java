package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        System.out.println(getMax(integers));
        System.out.println(getMax(new ArrayList<>()));  //<-- incase of empty list we are getting 0( default value)

        Optional<Integer> result = getMaxWithOptional(new ArrayList<>());
        if(result.isPresent()){
            System.out.println("Max"+ result.get());
        }else{
            System.out.println("Input is empty");
        }

        System.out.println(getMin(integers));
        System.out.println(getMinWithOptional(integers).get());
    }

    public static int getMax(List<Integer> integers){
      return  integers.stream()
                .reduce(0,(int1, int2) -> (int1>int2) ? int1 : int2);

    }

    public static Optional<Integer> getMaxWithOptional(List<Integer> integers){
        return  integers.stream()
                .reduce((int1, int2) -> (int1>int2) ? int1 : int2);

    }

    public static int getMin(List<Integer> integers){

        // Going to return 0 when we are expecting 6
        return  integers.stream()
                .reduce(0,(int1, int2) -> (int1<int2) ? int1 : int2);

    }

    public static Optional<Integer> getMinWithOptional(List<Integer> integers){
        return  integers.stream()
                .reduce((int1, int2) -> (int1<int2) ? int1 : int2);

    }
}

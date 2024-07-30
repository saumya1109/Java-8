package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        System.out.println(limit(integers));
        System.out.println(skip(integers)); // will skip first 3

    }

    public static int limit(List<Integer> integers){

        // Going to return 0 when we are expecting 6
        return  integers.stream()
                .limit(3)
                .reduce(0,(int1, int2) -> int1+ int2);

    }
    public static int skip(List<Integer> integers){

        // Going to return 0 when we are expecting 6
        return  integers.stream()
                .skip(3)
                .reduce(0,(int1, int2) -> int1+ int2);

    }
}

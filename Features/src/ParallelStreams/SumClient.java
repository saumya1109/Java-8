package ParallelStreams;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {

        Sum sum= new Sum();

        //If you have any mutable variables then don;t use parallel streams

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);

        System.out.println(sum.getTotal());    //500500
    }
}

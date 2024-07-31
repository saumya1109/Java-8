package NumericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());

        IntStream.range(1, 50).forEach((value -> System.out.print(value + " ")));
        System.out.println();
        IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + " ")));
        System.out.println();

        LongStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + " ")));
        System.out.println();

        IntStream.rangeClosed(1, 50).asDoubleStream().forEach((value -> System.out.print(value + " ")));
    }
}

package NumericStreams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateFunction {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println(sum);

        OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println(max.getAsInt());

        OptionalInt min = IntStream.rangeClosed(1, 50).min();
        System.out.println(min.getAsInt());

        long count = IntStream.rangeClosed(1, 50).count();
        System.out.println(count);

        OptionalDouble avg = IntStream.rangeClosed(1, 50).average();
        System.out.println(avg.getAsDouble());
        System.out.println(sum / count);


    }
}

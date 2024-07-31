package ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential execution : " +
                checkPeformanceResult(ParallelStreamExample::sum_sequential_stream,20));

        System.out.println("Parallel execution : " +
                checkPeformanceResult(ParallelStreamExample::sum_parallel_stream,20));

    }

    public static long checkPeformanceResult(Supplier<Integer> supplier, int num){

       long startTime= System.currentTimeMillis();
        for(int i=0;i<num;i++) {
            supplier.get();
        }
        long endTime= System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sum_sequential_stream(){
       return IntStream.rangeClosed(1,1000000)
                .sum();
    }

    public static int sum_parallel_stream(){
        return IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();
    }
}

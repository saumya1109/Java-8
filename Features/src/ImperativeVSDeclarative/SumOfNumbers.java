package ImperativeVSDeclarative;

import java.util.stream.IntStream;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(imperativeSum(0,100));
        System.out.println(declarativeSum(0,100));


    }

    public static int imperativeSum(int start, int end) {
        //Imperative --how style of programming
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static int declarativeSum(int start, int end) {
        //Declarative -- what style of programming
        int sum = IntStream.rangeClosed(start, end).sum();
        return sum;
    }

}

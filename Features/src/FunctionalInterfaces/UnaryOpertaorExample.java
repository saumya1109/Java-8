package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOpertaorExample {
    public static void main(String[] args) {
        introToUnaryExample();

    }

    public static void introToUnaryExample() {
        /* UnaryOperator<T> extends Function<T, T>
                when input and output are of same type
         * */
        UnaryOperator<String> u = (s) ->s.concat("default");
        System.out.println(u.apply("java8"));
    }
}

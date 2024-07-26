package MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {
    static Function<String,String> f0=(s)->s.toUpperCase();
    static Function<String,String> f1= String::toUpperCase;


    public static void main(String[] args) {
        System.out.println(f0.apply("java8"));
        System.out.println(f1.apply("java8"));
    }
}

package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

   static Function<String, String> string = (name) -> name.toUpperCase();
   static Function<String, String> addSomeString = (name)-> name.toLowerCase().concat("default");
    public static void main(String[] args) {

        introToFunction();

        //andThen will execute in order
        //Input--> java8 --> JAVA8 --> java8default
        System.out.println(string.andThen(addSomeString).apply("java8"));

        //Compose will first execute what is passed to that function and
        //Input--> java8 --> java8default -->JAVA8DEFAULT
        System.out.println(string.compose(addSomeString).apply("java8"));

    }

    public static void introToFunction(){
        /*
        * Represents a function that accepts one argument and produces a result.
        * Function<T, R>
            Accepts an input and returns the result
        * */
        System.out.println(string.apply("tryingIt"));
        System.out.println();

    }
}

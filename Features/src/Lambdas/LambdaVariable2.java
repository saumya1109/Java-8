package Lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {



    public static void main(String[] args) {

        //local variable
        int value=4;


        //Can work with static variables
        
        Consumer<Integer> c1= (i)->{
           // value++;    <----Variable used in lambda expression should be final or effectively final
            System.out.println(value+i);
        };

       // value=8;     <------ Variable used in lambda expression should be final or effectively final

        c1.accept(7);
    }
}

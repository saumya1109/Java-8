package Lambdas;
public class RunnableLambdaExample {

    public static void main(String[] args) {

        /*Prior Java 8*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");

            }
        };
        new Thread(runnable).start();

        // Java -8  lambda  -
        // (Lambda Input parameters ) -> Arrow {Lambda Body};
        Runnable runnableLambda = () -> {
            System.out.println("Inside Lambda Runnable");
        };
        new Thread(runnableLambda).start();

        //One line can be kept even without the brackets {}
        Runnable runnableLambda1 = () -> System.out.println("Inside Lambda1 Runnable");
        new Thread(runnableLambda1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3.1");
            }
        });

        new Thread(() -> System.out.println("Inside Lambda Runnable 4")).start();


    }
}


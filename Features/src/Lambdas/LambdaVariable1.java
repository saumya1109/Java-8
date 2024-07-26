package Lambdas;
import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        /* Not allowed to use the variable already defined in the scope*/

        int i=0;

      /*  Consumer<Integer> c= (i)->{
            System.out.println(i);
        };*/

          Consumer<Integer> c= (i1)->{
             // int i=2;  ---> will create an error
              System.out.println(i);
              System.out.println(i1);
        };
          c.accept(2);


    }
}

package Defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,6,7,8,55);

        Multiplier multiplier = new MultiplierImpl();

        //Can't use default methods in class as switches uses them
        //Default methods can be overridden but static can't as they are declared at class level


        System.out.println(multiplier.multiply(integerList));
        System.out.println(multiplier.size(integerList));
        System.out.println(Multiplier.isEmpty(integerList));



    }
}

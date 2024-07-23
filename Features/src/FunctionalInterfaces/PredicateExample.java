package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1= (a)->{return a%2==0;};
    static Predicate<Integer> p2 = (a) -> a%5==0;
    public static void main(String[] args) {
        introToPredicate();
        predicateAnd();
        predicateOr();
        predicateNegate();

    }
    public static void introToPredicate(){

        /*
        * Predicate is a functional interface that will take the input argument
           and  return  true if the input argument matches the predicate, otherwise false
        * */

        //Test is the abstract method

        System.out.println(p1.test(4));
        System.out.println(p1.test(9));

        //Single line statement
        Predicate<Integer> p= (i) -> i%2==0;
        System.out.println(p.test(6));

    }

    public static void predicateAnd(){
        System.out.println(p1.and(p2).test(10));
        System.out.println(p1.and(p2).test(9));
    }

    public static void predicateOr(){
        System.out.println(p1.or(p2).test(10));
        System.out.println(p1.or(p2).test(8));
    }

    public static void predicateNegate(){
        System.out.println("Negate Result is:" +p1.or(p2).negate().test(8));
    }

}

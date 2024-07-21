package Lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //prior java 8
        /*
        o1==o2  --> returns 0
        o1 < o2   --> returns -1
        o1 > o2 --> returns 1
        * */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(3,2));

        // Java 8
        Comparator<Integer> lambdaComparator = (Integer a, Integer b ) ->  a.compareTo(b);
        System.out.println(lambdaComparator.compare(3,2));

        //Don;t even need to mention type for method parameters
        Comparator<Integer> lambdaComparator1 = ( a,  b ) ->  a.compareTo(b);
        System.out.println(lambdaComparator1.compare(3,2));
    }
}

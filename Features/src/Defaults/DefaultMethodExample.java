package Defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {
    public static void main(String[] args) {

        // Sort this list
        List<String> list1 = Arrays.asList("Adam", "Eve", "Steven","Zoey","Rachel");

        //prior java 8
        Collections.sort(list1);
        System.out.println(list1);

        //java 8
        List<String> list2 = Arrays.asList("Adam", "Eve", "Steven","Zoey","Rachel");
        list2.sort(Comparator.naturalOrder());
        System.out.println(list2);
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2);

    }
}

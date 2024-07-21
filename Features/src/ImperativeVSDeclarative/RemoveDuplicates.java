package ImperativeVSDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
        System.out.println(imperativeRemoveDuplicates(integerList));
        System.out.println(declarativeRemoveDuplicates(integerList));


    }

    public static List<Integer> imperativeRemoveDuplicates(List<Integer> integerList) {
        //Imperative --how style of programming
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer n: integerList){
            if(!uniqueList.contains(n)){
                uniqueList.add(n);
            }
        }

        return uniqueList;
    }

    public static List<Integer> declarativeRemoveDuplicates(List<Integer> integerList) {
        //Declarative -- what style of programming

        List<Integer> uniqueList =integerList.stream().distinct().collect(Collectors.toList());
         return uniqueList;
    }


}

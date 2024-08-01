package Defaults;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    //One handy way of modifying the interface
    default int size(List<Integer> integerList){
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){
        return integerList!=null && integerList.size()>0;
    }

}

package Defaults;

public interface Interface1 {

    default void methodA(){
        System.out.println("Method A" + Interface1.class);
    }
}

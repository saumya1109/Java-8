package Defaults;

public interface Interface4 {

    default void methodA() {
        System.out.println("Method A" + Interface4.class);
    }
}

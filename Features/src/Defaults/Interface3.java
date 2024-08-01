package Defaults;

public interface Interface3  extends Interface1{

    default void methodC(){
        System.out.println("Method C");
    }
}

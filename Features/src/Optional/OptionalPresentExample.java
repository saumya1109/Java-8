package Optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        System.out.println(isPresent());
        ifPresent();

    }

    public static boolean isPresent(){
        //Optional<String> optional = Optional.ofNullable("Hello");
        Optional<String> optional = Optional.ofNullable(null);   //---> false
        return optional.isPresent();
    }

    public static void ifPresent(){
        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(s-> System.out.println(s));

    }
}

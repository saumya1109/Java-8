package Optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    public static void main(String[] args) {
        System.out.println(OfNullable());
        System.out.println(Of());
        System.out.println(empty());

    }

    public static Optional<String> OfNullable() {

        //When you are dealing with values that might be null.

        Optional<String> value = Optional.ofNullable("Hello");  //--> Optional[Hello]
        //Optional<String> value=  Optional.ofNullable(null); // ----> Optional.empty
        return value;

    }

    public static Optional<String> Of() {

        //Used when the value must not be null, enforcing this constraint at runtime.

        Optional<String> value = Optional.of("Hello"); // --> Optional[Hello]
        //Optional<String> value=  Optional.of(null); // ----> NullPointerException
        return value;

    }
    public static Optional<String> empty() {
        return Optional.empty();

    }
}


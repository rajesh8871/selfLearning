package OptionalExample;

import java.util.Optional;

//To avoid null pointers we earlier used to write null check now we can use option class
public class Example {
    public static void main(String[] args) {
        Optional<String> obj = Optional.empty();
        System.out.println("obj" + obj);

        Optional<String> obj1 = Optional.ofNullable("Rajesh");
        obj1.ifPresent(s -> System.out.println("UpperCase: " + s.toUpperCase()));

        /**
         * @throws NullPointerException if value is {@code null}
         */
        Optional<String> obj2 = Optional.of("Rajesh");
        obj2.ifPresent(s -> System.out.println("LowerCase: " + s.toLowerCase()));

        /**
         * Returns an {@code Optional} describing the given value, if
         * non-{@code null}, otherwise returns an empty {@code Optional}.
         */
        Optional<String> obj3 = Optional.ofNullable(null);
        System.out.println(Optional.ofNullable(Optional.empty()).orElse(Optional.of("No data")));

        String arr[] = new String[10];

        Optional<String> objChk = Optional.ofNullable(arr[4]);
        if (Optional.ofNullable(arr[4]).isEmpty()) {
            System.out.println(Optional.ofNullable(arr[2]).orElse("=======dataThanks"));
        }


    }
}

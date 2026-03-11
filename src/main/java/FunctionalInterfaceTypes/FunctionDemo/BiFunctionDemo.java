package FunctionalInterfaceTypes.FunctionDemo;


import java.util.function.BiFunction;

@FunctionalInterface
interface BiFunctionalInterface<T, U, R> {
    R apply(T t, U u);
}

public class BiFunctionDemo {


    public static void main(String[] args) {
        BiFunctionalInterface<Integer, Integer, String> obj = (t, u) -> {
            return t.toString();
        };
        String result = obj.apply(2, 3);
        System.out.println("Result: " + result);


        //default java example
        BiFunction<Integer, Integer, String> obj1 = (t, u) -> {
            return t.toString();
        };
        obj1.apply(2, 3);


    }
}

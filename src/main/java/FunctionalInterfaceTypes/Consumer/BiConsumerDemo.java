package FunctionalInterfaceTypes.Consumer;

import java.util.function.BiConsumer;

@FunctionalInterface
interface BiConsumerInterface<T, U> {
    void accept(T t, U u);
}

/*   In Java 8, BiConsumer is a functional interface;
 it takes two arguments and returns nothing.*/
public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumerInterface<Integer, Integer> obj = (x, y) -> {
            System.out.println("x: " + x + " Y: " + y);
        };
        obj.accept(2, 3);


        //default java example
        BiConsumer<Integer, Integer> obj1 = (x, y) -> {
            System.out.println("x: " + x + " Y: " + y);
        };
        obj1.accept(2, 3);

    }
}

package FunctionalInterfaceTypes.Consumer;

import java.util.function.Consumer;

@FunctionalInterface
interface ConsumerInterface<T> {
    void accept(T t);
}

/*The consumer interface accepts one argument but there is no return value.
        The name of function inside this interface is accept().*/
public class ConsumerDemo {

    public static void main(String[] args) {

        ConsumerInterface<String> consumerInterface = (x) -> {
            System.out.println(x.toLowerCase());
        };
        consumerInterface.accept("Rajesh");


        //default example of java consumer for accept method
        Consumer<Integer> obj = (x) -> {
            x.intValue();
        };
        obj.accept(2);

    }
}

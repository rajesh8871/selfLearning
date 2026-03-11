package FunctionalInterfaceTypes.Supplier;


import java.util.function.Supplier;

@FunctionalInterface
interface SupplierInterface<R> {
    R get();
}

/*In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.*/
public class SupplierDemo {

    public static void main(String[] args) {
        SupplierInterface<Integer> supplier = () -> {
            return 0;
        };
        supplier.get();

        //java default example
        Supplier<Integer> obj = () -> {
            return 0;
        };
        obj.get();

    }
}

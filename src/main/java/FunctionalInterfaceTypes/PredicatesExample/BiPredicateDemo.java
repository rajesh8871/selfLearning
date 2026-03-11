package FunctionalInterfaceTypes.PredicatesExample;

import java.util.function.BiPredicate;

@FunctionalInterface
interface BiPredicateInterface<T, U> {
    boolean test(T t, U u);
}

/*   In Java 8, BiPredicate is a functional interface, which accepts two arguments
     and returns a boolean,basically this BiPredicate is same with the Predicate, instead,
     it takes 2 arguments for the test.  */

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicateInterface<Integer, Integer> objDemo = (i, j) -> {
            return i > j;
        };

        System.out.println("Print Result: " + objDemo.test(2, 3));

        //Default class by Java Example
        BiPredicate<Integer, Integer> obj = (i, j) -> {
            return i > 0;
        };
        System.out.println(obj.test(2, 3));

    }
}

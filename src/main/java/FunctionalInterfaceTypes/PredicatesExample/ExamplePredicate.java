package FunctionalInterfaceTypes.PredicatesExample;

import java.util.function.Predicate;

/*Predicate will accept one argument, do some processing and then return boolean
Predicates is type of  functionalInterface with test method and some default methods*/

@FunctionalInterface
interface PredicateInterface<T> {
    boolean test(T t);
}

public class ExamplePredicate {

    public static void main(String[] args) {

        PredicateInterface<Integer> objDemo = (i) -> {
            return i > 0;
        };
        System.out.println("Print result: " + objDemo.test(2));


        //Default class by Java Example
        Predicate<String> obj = (s) -> {
            return s.length() > 0;
        };
        obj.test("Hello");
        System.out.println(obj.test("hi"));

    }
}


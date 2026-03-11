package FunctionalInterfaceTypes.FunctionDemo;

import java.util.function.Function;

//Custom class
@FunctionalInterface
interface FunctionDemoInterface<T, R> {
    R apply(T t);

}

/* In Java 8, Function is a functional interface, it takes an argument (object of type T) and
     returns an object (object of type R). The argument and output can be a different type.*/

public class FunctionDemo {
    public static void main(String[] args) {

        //here we set return type to Integer and argument to string
        //Custom FunctionInterface
        FunctionDemoInterface<String, Integer> obj = (x) -> x.length();
        int result = obj.apply("Rajesh");
        System.out.println("result: " + result);


        //Default example of java function
        Function<String, Integer> obj1 = (x) -> x.length();
        Function<Integer, Integer> obj2 = (x) -> x.intValue();
        int result1 = obj1.apply("Rajesh");
        System.out.println("result1: " + result1);
    }

}

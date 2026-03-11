package Lambda;

@FunctionalInterface
interface DoubleExample {
    int add(int a, int b);

    default void display() {
        System.out.println("Hi display Printed!!");
    }
}

public class DoubleParamExample {
    public static void main(String[] args) {

        DoubleExample doubleExample = (a, b) -> {
            return a + b;
        };

        System.out.println(doubleExample.add(2, 3));
        doubleExample.display();
    }
}

package Lambda;

@FunctionalInterface
public interface FunctionalInterfaceClass {
    void display();

    default void display1() {
        System.out.println("display1");
    }

    static void display2() {
        System.out.println("display2");
    }

    static void display3() {
        System.out.println("display2");
    }
}

package Lambda;

public class DemoApp {
    public static void main(String[] args) {
        FunctionalInterfaceClass functionalInterfaceClassObj = () -> {
            System.out.println("Function Invoked");
        };
        functionalInterfaceClassObj.display();

        FunctionalInterfaceClass obj1 = () -> System.out.println("if no parameter then " +
                "without bracket");

    }

}

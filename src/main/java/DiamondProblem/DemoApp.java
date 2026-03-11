package DiamondProblem;

public class DemoApp implements HdfcBank, SbiBank {
    public static void main(String[] args) {
        DemoApp app = new DemoApp();
        app.display();
        app.print();
/*        This will call the display method of overriden class below, if we want to
        call the other class display then change the class name then super dot display */

    }

    @Override
    public void display() {
        HdfcBank.super.display();
    }

    @Override
    public void print() {
        System.out.println("Thanks");
    }
}

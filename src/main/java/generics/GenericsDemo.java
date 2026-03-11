package generics;

public class GenericsDemo<T> {
    T obj;

    public GenericsDemo(T obj) {
        this.obj = obj;
    }

    public T printData() {
        return this.obj;
    }

    public static void main(String[] args) {
        //only reference can be used not primitive data type
        GenericsDemo<Integer> genericsDemo = new GenericsDemo(20);
        System.out.println(genericsDemo.printData());

        GenericsDemo<String> genericsDemo1 = new GenericsDemo<String>("Rajesh");

        System.out.println(genericsDemo1.printData());
    }
}

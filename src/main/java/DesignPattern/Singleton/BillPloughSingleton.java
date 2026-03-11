package DesignPattern.Singleton;

public class BillPloughSingleton {

    private BillPloughSingleton() {
    }

    private static class SingletonInnerClass {
        private static final BillPloughSingleton INSTANCE = new BillPloughSingleton();
    }

    public static BillPloughSingleton getInstance() {
        return SingletonInnerClass.INSTANCE;
    }

}

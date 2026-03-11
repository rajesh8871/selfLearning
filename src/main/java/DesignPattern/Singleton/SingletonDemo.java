package DesignPattern.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        System.out.println(BillPloughSingleton.getInstance().equals(BillPloughSingleton.getInstance()));

        System.out.println(EagerSingleton.getInstance().equals(EagerSingleton.getInstance()));

        System.out.println(LazySingleton.getInstance().equals(LazySingleton.getInstance()));
        System.out.println(DoubleLockSingleton.getInstance().equals(DoubleLockSingleton.getInstance()));
        System.out.println(DoubleLockSingleton.getInstance().hashCode());
        System.out.println(DoubleLockSingleton.getInstance().hashCode());
    }
}

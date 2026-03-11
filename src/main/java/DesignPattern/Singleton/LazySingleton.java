package DesignPattern.Singleton;

public class LazySingleton {
    private static LazySingleton lazyInstance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {

        if (lazyInstance == null)
            return lazyInstance = new LazySingleton();
        else
            return lazyInstance;

    }
}

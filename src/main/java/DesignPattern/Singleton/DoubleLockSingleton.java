package DesignPattern.Singleton;

public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton INSTANCE;

    private DoubleLockSingleton() {

    }

    public static DoubleLockSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleLockSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleLockSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
/*One thing to keep in mind with this pattern is that the field needs to be volatile to
 prevent cache incoherence issues. In fact, the Java memory model
allows the publication of partially initialized objects and this may lead in turn to subtle bugs.*/
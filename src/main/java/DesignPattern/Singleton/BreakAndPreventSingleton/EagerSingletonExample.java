package DesignPattern.Singleton.BreakAndPreventSingleton;

import java.io.Serializable;

public class EagerSingletonExample extends CloneClass implements Serializable {

    private static EagerSingletonExample INSTANCE;

    static {
        try {
            INSTANCE = new EagerSingletonExample();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /*To overcome reflaction breaking issue we can check if instance not null then can throw error.
                                    or
     To overcome issue raised by reflection, enums are used because java ensures internally
     that enum value is instantiated only once. Since java Enums are globally accessible, they
     can be used for singletons.
     Its only drawback is that it is not flexible i.e it does not allow lazy initialization.*/
    private EagerSingletonExample() throws IllegalAccessException {
        if (INSTANCE != null) {
            throw new IllegalAccessException("obj can't be create using reflection");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //either throw CloneNotSupportedException or just return INSTANCE obj
        return INSTANCE;
    }

    // implement readResolve method for serializable issue resolution
    protected Object readResolve() {
        return INSTANCE;
    }

    public static EagerSingletonExample getInstance() {
        return INSTANCE;
    }
}

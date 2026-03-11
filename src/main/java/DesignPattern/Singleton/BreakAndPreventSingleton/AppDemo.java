package DesignPattern.Singleton.BreakAndPreventSingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class AppDemo {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        EagerSingletonExample instance1 = EagerSingletonExample.getInstance();
        EagerSingletonExample instance2 = (EagerSingletonExample) instance1.clone();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        /*
        Cloning: Cloning is a concept to create duplicate objects. Using clone we can create
        copy of object. Suppose, we create clone of a singleton object, then it will create a
        copy that is there are two instances of a singleton class, hence the class is no more singleton.

        Output :-
        instance1 hashCode:- 366712642
        instance2 hashCode:- 1829164700
        Two different hashCode means there are 2 different objects of singleton class.

        Prevention--
        Overcome Cloning issue:- To overcome this issue, override clone() AND either throw
        CloneNotSupportedException or just return INSTANCE obj. Now whenever user will try to
        create clone of singleton object, it will throw exception or return same obj
        and hence our class remains singleton.*/



        /*Reflection Example*/
        /*To overcome reflection breaking issue we can check if instance not null then can throw error.
                                    or
             To overcome issue raised by reflection, enums are used because java ensures internally
             that enum value is instantiated only once. Since java Enums are globally accessible, they
             can be used for singletons.
             Its only drawback is that it is not flexible i.e it does not allow lazy initialization.*/

        /*

        EagerSingletonExample instance3 = EagerSingletonExample.getInstance();
        EagerSingletonExample reflectionInstance = null;

        Constructor[] constructor = EagerSingletonExample.class.getDeclaredConstructors();
        for (Constructor obj : constructor) {
            obj.setAccessible(true);
            reflectionInstance = (EagerSingletonExample) obj.newInstance();
        }
        System.out.println(instance3.hashCode());
        System.out.println(reflectionInstance.hashCode());*/

        /*Serialization Example*/
        /*Serialization:- Serialization can also cause breakage of singleton property of
         singleton classes. Serialization is used to convert an object of byte stream and save
         in a file or send over a network. Suppose you serialize an object of a singleton class. Then if
         you de-serialize that object it will create a new instance and hence break the singleton pattern.*/

        /*Overcome serialization issue:-
        To overcome this issue, we have to implement method readResolve() method.*/
        EagerSingletonExample instance4 = EagerSingletonExample.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instance4);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        EagerSingletonExample instance5 = (EagerSingletonExample) in.readObject();
        in.close();
        System.out.println(instance4.hashCode());
        System.out.println(instance5.hashCode());

    }
}

package serialization;

import java.io.*;

/*If a serializable class doesn’t explicitly declare a serialVersionUID, then the serialization
runtime will calculate a default one for that class based on various aspects of class,
as described in Java Object Serialization Specification. However it is strongly
recommended that all serializable classes explicitly declare serialVersionUID value,
since its computation is highly sensitive to class details that may vary depending on compiler
implementations, any change in class or using different id may affect the serialized data.*/
class Emp implements Serializable {

    /*It is also recommended to use private modifier for UID since it is not
    useful as inherited member*/
    private static final long serialVersionUID = 129348938L;

    /*In case of transient variables:- A variable defined with transient keyword is not serialized
    during serialization process.This variable will be initialized with default value
    during deserialization. (e.g: for objects it is null, for int it is 0).
    */
    transient int a;//transient and static value won't save, so it can get changed

    /*In case of static Variables:- A variable defined with static keyword is not serialized during
    serialization process.This variable will be loaded with current value defined in the class during
    deserialization.*/
    static int b;
    String name;
    int age;

    // Default constructor
    public Emp(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

}


public class SerialExample {
    public static void printData(Emp object1) {

        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }

    public static void main(String[] args) {
        Emp object = new Emp("ab", 20, 2, 1000);
        String filename = "shubham.txt";

        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                    (filename);
            ObjectOutputStream out = new ObjectOutputStream
                    (file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printData(object);

            // value of static variable changed
            object.b = 2000;
            object.a=16;//even after setting it will change to default value while deserialization
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        object = null;

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream
                    (filename);
            ObjectInputStream in = new ObjectInputStream
                    (file);

            // Method for deserialization of object
            object = (Emp) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            printData(object);

            // System.out.println("z = " + object1.z);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }
    }
}

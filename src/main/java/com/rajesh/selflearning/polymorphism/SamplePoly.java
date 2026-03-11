package com.rajesh.selflearning.polymorphism;


// Java Program for Method Overriding

// Class 1
// Helper class
class Parent {

    // Method of parent class
    static void Print()
    {

        // Print statement
        System.out.println("parent class");
    }
    void add()
    {
        System.out.println("Thankuuuuuuu");
    }
    static void Print1()
    {

        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {

    // Method
    static void Print() { System.out.println("subclass1"); }
    void add()
    {
        System.out.println("Thankuuuuuuu   subclass1");
    }
}

// Class 3
// Helper class
class subclass2 extends Parent {

    // Method
    static void Print()
    {

        // Print statement
        System.out.println("subclass2");
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new subclass1();
        a.Print1();
        a.add();

        a = new subclass2();
        a.Print();

        subclass2.Print();



    }
}

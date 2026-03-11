package com.rajesh.selflearning;

import com.rajesh.selflearning.inheritance.Parent;

class parent {
    public void parentMethod() {
        System.out.println("Parent class");
    }
}

public class example2 extends parent {
    public void childMethod() {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        parent p1= new example2();
        p1.parentMethod();
       // p1.childMethod();// not work
        parent p2= new parent();
        p2.parentMethod();
       // p2.childMethod();//not work
        example2 p3= new example2();
        p3.childMethod();
        p3.parentMethod();



    }

}


package com.rajesh.selflearning;

public class Tester extends Thread {
     int code = 9;

    public void run() {
        this.code = 7;
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.start();
        for (int i = 0; i <5;i++)
        {
            System.out.println(tester.code);
        }
    }
}

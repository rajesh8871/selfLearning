package com.rajesh.selflearning.gfg;

public class FibonacciSeries {
    public static void main(String[] args) {

        /*0,1,1,2,3,5,8,13*/
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i < 10; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

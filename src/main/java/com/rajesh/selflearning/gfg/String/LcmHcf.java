package com.rajesh.selflearning.gfg.String;

import java.util.Scanner;

public class LcmHcf {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int t = 1;

        while (t-- > 0) {
            int a = 120;
            int b = 140;
            int gcdValue = gcd(a, b);

            int lcmValue = lcm(a, b, gcdValue);
            System.out.println(gcdValue + " " + lcmValue);
        }


    }
}




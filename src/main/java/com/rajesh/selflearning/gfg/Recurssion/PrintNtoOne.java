package com.rajesh.selflearning.gfg.Recurssion;

public class PrintNtoOne {
    //This is example of tail recursion as last is recursion call.
    public static void recursion(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        recursion(n - 1);//if we put this line above of above line then output will be like 1,2......n

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        recursion(130);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

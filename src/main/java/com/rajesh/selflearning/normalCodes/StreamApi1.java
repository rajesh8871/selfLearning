package com.rajesh.selflearning.normalCodes;

import java.util.Arrays;
import java.util.List;

public class StreamApi1 {
    public static void main(String[] args) {

        List<Integer> obj = Arrays.asList(1, 2, 3, 4, 5, 6);
        obj.forEach(i -> doubleIt(i));

        //or This is also correct way
        //This is called method by reference
        obj.forEach(StreamApi1::doubleIt);

        System.out.println(">>>" + obj.stream().filter(i -> i % 2 == 0).reduce(0, (c, e) -> c + e));
        System.out.println(">>>" + obj.stream().filter(i -> i % 2 == 0).map(i -> i * 2).reduce(0, (c, e) -> c + e));
        System.out.println(">>>" + obj.stream().filter(i -> i % 2 == 0).map(i -> i * 2).findAny().orElse(8));

    }

    public static void doubleIt(int i) {
        System.out.println(i * 2);
    }
}

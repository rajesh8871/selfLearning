package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr[] = {10000, 100, 20000, 500, 4000};
        int highest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (highest < arr[i]) {
                highest = arr[i];
            }
        }
        Arrays.stream(arr).max().ifPresent(System.out::println);
        System.out.println(highest);
    }


}

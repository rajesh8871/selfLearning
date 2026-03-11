package com.rajesh.selflearning.gfg.Array;


import java.util.Arrays;


public class MergeTwoArray {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 8, 6};
        int[] arr1 = {10, 7, 4};
        int count = 0;
        int mergedArr[] = new int[arr.length + arr1.length];
        for (int a : arr) {
            mergedArr[count] = a;
            count++;
        }

        for (int a : arr1) {
            mergedArr[count] = a;
            count++;
        }

        Arrays.sort(mergedArr);
        System.out.println("" + Arrays.toString(mergedArr));

    }
}

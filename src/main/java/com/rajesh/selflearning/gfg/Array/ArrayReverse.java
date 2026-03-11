package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 4, 9, 8, 0};
        int k = arr.length - 1;
        int temp = 0;

        for (int i = 0; i < arr.length / 2; i++, k--) {
            temp = 0;
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

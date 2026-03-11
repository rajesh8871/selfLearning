package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 0, 0, 4, 13, 0, 0, 0, 0, 1};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

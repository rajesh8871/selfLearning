package com.rajesh.selflearning.practice;

import java.util.Arrays;

public class LeftRotateArrayData {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 0, 3};
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        System.out.println("Array : " + Arrays.toString(arr));
    }
}

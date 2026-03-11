package com.rajesh.selflearning.practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 0, 3};
        int k = arr.length - 1;
        int temp;
        for (int i = 0; i < arr.length / 2; i++, k--) {
            temp = 0;
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;


        }

        System.out.println("Array : " + Arrays.toString(arr));
    }
}

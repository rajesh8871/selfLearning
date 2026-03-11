package com.rajesh.selflearning.practice;

import java.util.Arrays;

public class RightRotateArray {

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 0, 3};
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];//start from last element shifting
        }
        arr[0] = temp;
        System.out.println("Array : " + Arrays.toString(arr));
    }

}

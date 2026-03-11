package com.rajesh.selflearning.practice;

import java.util.Arrays;

public class MoveAllzeroToLast {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 5, 6, 0, 7, 0, 3};

        int temp;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }


        }

        System.out.println("Array : " + Arrays.toString(arr));
    }
}


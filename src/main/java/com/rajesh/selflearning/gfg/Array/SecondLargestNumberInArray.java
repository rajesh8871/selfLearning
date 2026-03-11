package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public static int getLargestIndex(int arr[]) {
        int largestNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 8, 10};
        int largest = getLargestIndex(arr);
        System.out.println("Largest Number: " + largest);
        int secondLargest = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != largest) && (arr[i] > secondLargest)) {
                index = i;
                secondLargest = arr[i];
            }
        }

        System.out.println("secondLargest: " + secondLargest + " Index Number: " + index);


    }
}



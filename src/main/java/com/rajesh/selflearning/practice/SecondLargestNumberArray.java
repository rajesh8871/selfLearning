package com.rajesh.selflearning.practice;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int array[] = {1, 5, 6, 3, 4};
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        System.out.println("Largest Number: " + largest);

        for (int i = 0; i < array.length; i++) {
            if ((array[i] != largest) && (array[i] > secondLargest)) {
                secondLargest = array[i];
            }
        }
        System.out.println("Second Largest Number: " + secondLargest);
    }
}

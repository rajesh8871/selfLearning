package sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        //O(n) complexity
        //If the array is from 1 to N then use cyclic sort
        //each element actual index will be the element -1
        //check element swap and keep repeating same
        int i = 0; //to track the index
        while (i < arr.length) {
            int correctElementIndex = arr[i] - 1;// as the element starts from 0 and the element is from 0 to N
            if (arr[correctElementIndex] != arr[i]) {
                //swap to the actual index
                swap(arr, correctElementIndex, i);
            } else {
                i++; //as the current element index is at the correct index so move to new element
            }

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

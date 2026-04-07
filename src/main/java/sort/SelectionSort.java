package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {0, 3, 7, 1, 2, 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        //find the maximum number and swap it with the last index element
        for (int i = 0; i < arr.length; i++) {
            int maxElementIndex = 0;
            int last = arr.length - i -1;
            for (int j = 0; j <= arr.length - i - 1; j++) {

                if (arr[j] > arr[maxElementIndex]) {
                    maxElementIndex = j;
                }
            }
            swap(arr, last, maxElementIndex);
                    }
    }

    public static void swap(int arr[], int last, int maxElementIndex) {
        int temp = arr[last];
        arr[last] = arr[maxElementIndex];
        arr[maxElementIndex] = temp;
    }
}

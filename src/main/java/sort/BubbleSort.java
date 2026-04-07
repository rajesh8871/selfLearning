package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 6, 0};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]) {
        //we have to compare the two adjacent element and swap it
        for (int i = 0; i < arr.length; i++) {
            //considering on every loop of i the one big element will be move to last which we can ignore
            //next time
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    //swap it
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}

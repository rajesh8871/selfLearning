package com.rajesh.selflearning.gfg.Array;


import java.util.Arrays;

/*
*Example 1:

Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.
Example 2:

Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10,
second max = 100, second min = 20, and
so on... Modified array is :
110 10 100 20 90 30 80 40 70 50 60.
* */
public class RearrangeArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int n = arr.length;
        Arrays.sort(arr);
        int j = arr.length - 1;
        int modifiedArray[] = new int[n];
        int count = 0;
        for (int i = 0; i <= n / 2; i++, j--) {

            if (count == arr.length - 1) {
                modifiedArray[count++] = arr[j];
                break;
            }
            if (count != arr.length) {
                modifiedArray[count++] = arr[j];
                modifiedArray[count++] = arr[i];
            }

        }
        System.out.println("result: " + Arrays.toString(modifiedArray));
    }
}

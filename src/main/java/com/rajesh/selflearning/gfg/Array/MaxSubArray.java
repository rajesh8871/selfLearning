package com.rajesh.selflearning.gfg.Array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 7,-1,6};
        int n = arr.length;
        int maxSoFar = arr[0];
        int maxEndingHere = 0;

        for (int i = 0; i < n; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        System.out.println("MAX : " + maxSoFar);
    }

}

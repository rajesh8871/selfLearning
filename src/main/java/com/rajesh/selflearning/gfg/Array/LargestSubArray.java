package com.rajesh.selflearning.gfg.Array;

public class LargestSubArray {

    public static void main(String[] args) {
        LargestSubArray large = new LargestSubArray();
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int n = arr.length;
//        System.out.println("Length of the longest contiguous subarray is "
//                + large.findLength(arr, n));

        int max_len = 1;
        for (int i = 0; i < n - 1; i++) {
            int max = arr[i], min = arr[i];
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);

                if ((max - min) == (j - i)) {
                    max_len = Math.max(max_len, max - min + 1);
                }
            }
        }
        System.out.println("Max length:" + max_len);
    }
}

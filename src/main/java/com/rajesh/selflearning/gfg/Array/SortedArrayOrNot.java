package com.rajesh.selflearning.gfg.Array;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 0};
        boolean flagSort = true;
        for (int i = 0; i < arr.length; i++) {
            if ((i < arr.length - 1) && (arr[i] > arr[i + 1])) {
                flagSort = false;
                break;
            }
        }
        System.out.println(flagSort);

    }
}

package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMissingNumber {
    public static void main(String[] args) {
        //10 is missing
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14};

        int N = 14;
        int idealSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(numbers).sum();

        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);


    }
}

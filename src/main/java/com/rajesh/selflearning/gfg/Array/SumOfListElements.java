package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;
import java.util.List;

public class SumOfListElements {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14);

        //calculating sum of list elements
        //mapToInt produces IntStream
        System.out.println(num.stream().mapToInt(Integer::intValue).sum());

        int arr[] = {1, 2, 1, 4, 5};
        System.out.println(Arrays.stream(arr).sum());
    }
}

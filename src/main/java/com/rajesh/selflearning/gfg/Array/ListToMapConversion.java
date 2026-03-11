package com.rajesh.selflearning.gfg.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 6);

        Map<Integer, Integer> convertedData = list.stream()
                .collect(Collectors.toMap(i -> i, i -> i));
    }
}

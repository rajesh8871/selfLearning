package com.rajesh.selflearning.gfg.Array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ElementsFrequency {
    public static void main(String[] args) {

        List<String> obj = Arrays.asList("hi", "hello", "hi", "one", "two", "two");
        Map<String, Long> newData = obj
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //printing according to frequency
        newData
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        System.out.println(e.getKey());
                    }
                });

        System.out.println(newData);

        int arr[] = {1, 2, 2, 4, 4, 5, 8, 8, 0};
        Map<Integer, Long> data = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("printing according to frequency" + data);
        //printing according to frequency
        data
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(x -> {
                    for (int i = 0; i < x.getValue(); i++) {
                        System.out.println(x.getKey());
                    }
                });


    }
}

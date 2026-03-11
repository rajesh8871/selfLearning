package com.rajesh.selflearning.gfg.Array;


import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintAccordingToFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 5, 5, 3, 8, 8, 8, 8, 8};

        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (!data.containsKey(arr[i]))
                data.put(arr[i], 1);
            else {
                data.put(arr[i], data.get(arr[i]) + 1);
            }
        }


        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //Create an ArrayList to hold sorted elements

        ArrayList<Integer> sortedElements = new ArrayList<>();

        //Java 8 code to sort elementCountMap by values in reverse order
        //and put keys into sortedElements list

        data
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for (int i = 1; i <= entry.getValue(); i++)
                        sortedElements.add(entry.getKey());
                });


        System.out.println(sortedElements);




        //second solution

        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        System.out.println(e.getKey());
                    }
                });
    }

}

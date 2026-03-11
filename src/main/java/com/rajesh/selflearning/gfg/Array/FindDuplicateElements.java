package com.rajesh.selflearning.gfg.Array;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static <T> Set<T> findDuplicateInStream(List<T> list) {

        //        first solution

/*        // Return the set of duplicate elements
        return list
                .stream()
                .filter(i -> Collections.frequency(list, i) > 0)
                .collect(Collectors.toSet());*/

        // second solution

        // Set to store the duplicate elements
        Set<T> items = new HashSet<>();
        // Return the set of duplicate elements
        return list.stream()

                // Set.add() returns false
                // if the element was
                // already present in the set.
                // Hence filter such elements
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }

    // Driver code
    public static void main(String[] args) {

        // Initial stream
        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

        // Print the found duplicate elements
        System.out.println(findDuplicateInStream(list));
    }
}

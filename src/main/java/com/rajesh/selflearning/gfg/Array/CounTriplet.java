package com.rajesh.selflearning.gfg.Array;

/*
Example 1:
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets:
1 + 2 = 3 and 3 +2 = 5

Example 2:
Input:
N = 3
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CounTriplet {

    public static void main(String[] args) {
        int[] data = {1, 5, 3, 2, 8, 6};
        int count = 0;
        Set<Integer> triplet = Arrays.stream(data).boxed().collect(Collectors.toSet());
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < data.length; j++) {
                sum = data[i] + data[j];

                /*both methods below are capable to find the solutions*/
                count = checkTriplet(sum, data, count);
                //count = checkTriplet(sum, triplet, count);
            }
        }
        System.out.println("Count: " + count);
    }

    private static int checkTriplet(int sum, Set<Integer> triplet, int count) {
        if (triplet.contains(sum))
            count++;
        return count;
    }

    private static int checkTriplet(int sum, int[] data, int count) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == sum) {
                System.out.print("Triplets are: " + sum + " ");
                count++;
            }
        }
        return count;
    }

}

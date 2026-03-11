package com.rajesh.selflearning.gfg.Array;

import java.util.*;



/*Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.


Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.
*/
public class SubArraySum {
    public static void main(String[] args) {
        int n = 10;
        int s = 125;
        int[] m = {123, 2, 3, 0, 5, 6, 3, 8, 9, 10};
        Solution obj = new Solution();
        ArrayList<Integer> res = obj.subarraySum(m, n, s);
        for (int ii = 0; ii < res.size(); ii++)
            System.out.print(res.get(ii) + " ");
        System.out.println();
    }

}

class Solution {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (sum == s) {
                    data.add(i + 1);
                    data.add(j);
                    return data;
                } else if (sum > s) {
                    break;
                } else {
                    sum += arr[j];
                }
            }
        }
        data.add(-1);
        List ints = Arrays.asList(1,2);
        List nums=ints;
        nums.add(3.13);
        return data;
    }
}


package com.rajesh.selflearning.gfg.Array;

/*
Example 1:

Input:
M = 3, X[] = [2 1 6]
N = 2, Y[] = [1 5]
Output: 3
Explanation:
The pairs which follow xy > yx are
as such: 21 > 12,  25 > 52 and 61 > 16 .
Example 2:

Input:
M = 4, X[] = [2 3 4 5]
N = 3, Y[] = [1 2 3]
Output: 5
Explanation:
The pairs for the given input are
21 > 12 , 31 > 13 , 32 > 23 , 41 > 14 ,
51 > 15 .
* */
public class pairs {
    public static void main(String[] args) {
        int x[] = {2, 3, 4, 5};
        int y[] = {1, 2, 3};

        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {

                if (Math.pow(x[i], y[j]) > Math.pow(y[j], x[i])) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}

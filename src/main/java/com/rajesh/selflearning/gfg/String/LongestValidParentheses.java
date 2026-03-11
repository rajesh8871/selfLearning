package com.rajesh.selflearning.gfg.String;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "()))((";
        LongestValidParentheses obj = new LongestValidParentheses();
       System.out.println( obj.longestValidParentheses(s));
    }

    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}
/*
*
((()))
((((()))
))(((
Given a string containing just the characters '(' and ')', find the length of the longest valid
(well-formed) parentheses substring.
Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:
Input: s = ""
Output: 0
4. Given an unsorted integer array nums, return the smallest missing positive integer.

* */


/*
* Given a m x n grid filled with non-negative numbers, find a path from top left to bottom
right, which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.
Example 1 :
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

* */
package com.rajesh.selflearning.practice;

public class IsPallindrome {
    public static boolean isPallindrome(String string, int start, int last) {
        if (start >= last)
            return true;

        return (string.charAt(start) == string.charAt(last) && isPallindrome(string, start + 1, last - 1));
    }

    public static void main(String[] args) {
        String string = "abba";
        int start = 0;
        int last = string.length() - 1;
        System.out.println(isPallindrome(string, start, last));

    }
}

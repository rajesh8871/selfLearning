package com.rajesh.selflearning.gfg.Recurssion;

public class Palindrome {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start+1, end - 1));
    }

    public static void main(String[] args) {
        String str = "abac";
        int start = 0;
        int end = str.length() - 1;
        boolean check = isPalindrome(str, start, end);
        System.out.println(check);
    }
}

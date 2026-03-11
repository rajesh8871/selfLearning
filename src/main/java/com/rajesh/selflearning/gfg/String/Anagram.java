package com.rajesh.selflearning.gfg.String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "rajesh";
        String b = "hsejar";
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (String.valueOf(a1).equals(String.valueOf(a2))) {
            System.out.println("com.rajesh.selflearning.gfg.String.Anagram");
        } else
            System.out.println("NOt com.rajesh.selflearning.gfg.String.Anagram");
    }
}

package com.rajesh.selflearning.gfg.String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String[] s2 = s.split("\\.");
        for (int i = s2.length - 1; i >= 0; i--) {
            System.out.println(s2[i]);
        }
        
    }
}

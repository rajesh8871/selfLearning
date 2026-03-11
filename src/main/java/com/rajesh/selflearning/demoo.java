package com.rajesh.selflearning;

import java.util.Arrays;
import java.util.HashSet;

public class demoo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        String s2 = "love";

        builder.append(s2);
        builder.substring(4);
        System.out.println(builder.indexOf(s2));

        for (final String workingDay : new HashSet<String>(
                Arrays.asList("WEDNESDAY", "MONDAY", "THURSDAY", "TUESDAY", "FRIDAY"))) {
            System.out.println(workingDay);
        }
    }
}

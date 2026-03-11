package com.rajesh.selflearning.gfg.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        int aa = 1234580;
        char aa1[] = Integer.toString(aa).toCharArray();
        Arrays.sort(aa1);

        String str = "rajesrh";
        String nonRepeatingChar = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println("nonRepeatingChar: " + nonRepeatingChar);

    }
}

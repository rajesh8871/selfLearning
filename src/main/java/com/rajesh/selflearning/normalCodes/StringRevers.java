package com.rajesh.selflearning.normalCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringRevers {
    public static void main(String[] args) {
        /*Siht si a  tnemetats
         */
        String str = "This is a statement";
        String data[] = str.split(" ");
        StringBuilder finalData = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            char[] arra = data[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = arra.length - 1; j >= 0; j--) {
                sb.append(arra[j]);
            }
            finalData.append(sb + " ");
        }

        System.out.println("hii" + finalData.toString().trim());

        List<Integer> hii = new ArrayList<>();

        hii.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());


    }
}

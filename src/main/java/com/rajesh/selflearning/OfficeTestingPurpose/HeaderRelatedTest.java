package com.rajesh.selflearning.OfficeTestingPurpose;


import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HeaderRelatedTest {
    public static void main(String[] args) {
        String one[] = {"rajesh"};
        Map<String, String[]> headers = new HashMap();
        headers.put("name", one);
        headers.put("contentType", one);
        headers.put("reason", one);

        HttpHeaders httpHeaders = new HttpHeaders();
        headers.forEach((k, v) -> httpHeaders.add(k, v[0]));
        httpHeaders.forEach((k,v) -> System.out.println(k+","+v));

        HttpHeaders httpHeaders1 = new HttpHeaders();
        headers.forEach((k, v) -> httpHeaders1.addAll(k, Arrays.asList(v)));
        httpHeaders1.forEach((k, v) -> {
            System.out.println(k + "," + v);
        });



    }

}

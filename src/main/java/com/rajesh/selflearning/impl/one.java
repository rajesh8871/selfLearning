package com.rajesh.selflearning.impl;

import com.rajesh.selflearning.interfaces.ProcessClass;
import org.springframework.stereotype.Service;

@Service
public class one implements ProcessClass {
    public int add(int a, int b) {

        return b + a;
    }
}

package com.rajesh.selflearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example extends Exception {

    // Driver code
    public static void main(String[] args) {

        try {
            throw new example();
        }
        catch (example e) {
            System.out.println("Got the Test Exception");
        }
        finally
        {
            System.out.println("Inside finally block ");
        }
    }
}

// Java code for Stream map(Function mapper)
// to get a stream by applying the
// given function to this stream.





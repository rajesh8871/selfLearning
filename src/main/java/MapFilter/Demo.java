package MapFilter;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 6);

        Map<Integer, Integer> convertedData = list.stream()
                .collect(Collectors.toMap(i -> i, i -> i));


    }

}

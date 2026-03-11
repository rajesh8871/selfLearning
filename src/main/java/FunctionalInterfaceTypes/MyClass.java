package FunctionalInterfaceTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String args[]) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        System.out.println(MyClass.randomList(numList));

    }

    public static List<Integer> randomList(List<Integer> listNum) {
        Collections.shuffle(listNum);
        return listNum;
    }
}


package generics;

import java.util.Arrays;
import java.util.List;


/*The question mark (?) is known as the wildcard in generic programming.
 It represents an unknown type. */
class UpperLowerBoundWildCard {

    //only reference can be used not primitive type allowed
    public static void main(String[] args) {
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        sum(list1);

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        // printing the sum of elements in list
        sum(list2);
        // Double list
        List<Number> list3 = Arrays.asList(4.1, 5.1, 6.1);
        sumLowerBound(list3);
        // sumLowerBound(list2);//not allowed due to lower bound only super class and that class allowed

        unBound(list1);
        unBound(list2);
        unBound(list3);
    }

    /* 1. Upper Bounded Wildcards: These wildcards can be used when you want to relax the
       restrictions on a variable. For example, say you want to write a method that works
       on List < Integer >, List < Double >, and List < Number >, you can do this using an
       upper bounded wildcard.*/
    private static void sum(List<? extends Number> list) {
        System.out.println(list);
    }

    /* Lower Bounded Wildcards: It is expressed using the wildcard character (‘?’), followed
       by the super keyword, followed by its lower bound: <? super A>. */
    private static void sumLowerBound(List<? super Integer> list) {
        System.out.println(list);
    }

    private static void unBound(List<?> list) {
        System.out.println(list);
    }

}

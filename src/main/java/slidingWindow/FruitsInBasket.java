package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class FruitsInBasket {


    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int basket = 2;
        int maxFruits = 0;
        System.out.println(fruitsInBasket(arr, basket, maxFruits));
    }

    public static int fruitsInBasket(int fruits[], int basket, int maxFruits) {

        for (int i = 0; i < fruits.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < fruits.length; j++) {
                //add the fruits into basket
                set.add(fruits[j]);
                //check if the basket is still not fill till limit
                if (set.size() <= basket) {
                    //check the size of sliding
                    maxFruits = Math.max(maxFruits, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxFruits;
    }

}

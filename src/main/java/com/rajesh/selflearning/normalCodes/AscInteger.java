package com.rajesh.selflearning.normalCodes;

public class AscInteger {
    public static void main(String[] args) {
        int a[] = {33, 3, 4, 5, 1, 0, -1, 454};
        // Arrays.sort(a);
        int data1 = 7654434;
        long count = Integer.toString(data1).chars().filter(ch -> ch == '4').count();
        System.out.println(count + "count<<<<<<<<<<<");
        int temp;
        //2nd way to sort
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (i != a.length - 1)
                    if ((a[i] > a[j])) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;

                    }

            }
            for (int k = 0; k < a.length; k++)
                System.out.println(a[k]);

        }
//        for (int i = 0; i < a.length; i++)
//            System.out.println(a[i]);
    }

}

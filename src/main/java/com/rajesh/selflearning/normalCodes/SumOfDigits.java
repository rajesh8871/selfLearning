package com.rajesh.selflearning.normalCodes;

public class SumOfDigits {

    public static void main(String[] args) throws Exception {
        int data = 456;

        int result = 0;
        result = String.valueOf(data)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        String data1 = Integer.toString(data);
        String str = "456765";
        char[] ch = new char[str.length()];

        // Copy character by character into array
        String dr = null;
        for (int i = str.length() - 1; i > 0; i--) {
            ch[i] = str.charAt(i);

        }
        System.out.println(ch.toString() + ">>>>>>>>>>>>>>>>");

        int a = Character.getNumericValue(data1.charAt(0));
        int b = Character.getNumericValue(data1.charAt(data1.length() - 1));

        System.out.println(a + b);


        System.out.println(result);
        System.out.println(1 % 2);

    }
}

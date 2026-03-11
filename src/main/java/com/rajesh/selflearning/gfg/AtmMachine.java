package com.rajesh.selflearning.gfg;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int amountAvailable[] = {50, 20, 10};
        String notes = "";
        for (int i = 0; i < amountAvailable.length; i++) {

            if (amount > 0) {
                int temp = amount / amountAvailable[i];
                amount = amount % amountAvailable[i];
                notes = notes + temp + "*" + amountAvailable[i] + "+";

            } else
                break;
        }
        System.out.println("NOtes: " + notes.substring(0, notes.length() - 1));
    }
}

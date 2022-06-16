package com.bridgelab.day5;

import java.util.Scanner;

public class Quotient_Rem {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the value of divident");
        int divident = num.nextInt();
        System.out.println("Enter the value of divisor");
        int divisor = num.nextInt();
        int quotient = divident/divisor;
        int rem = divident%divisor;
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + rem);
    }
}

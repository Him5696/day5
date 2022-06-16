package com.bridgelab.day5;

import java.util.Scanner;

public class Power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing till power value " + n);
        for(int i=1; i<=n; i++){
            System.out.println("power of 2^" + i + " is " + (Math.pow(2, i)));
        }
    }
}

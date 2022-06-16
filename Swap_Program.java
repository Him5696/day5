package com.bridgelab.day5;

import java.util.Scanner;

public class Swap_Program {
    public static void main(String[] args) {
        int a, b, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a & b ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before Swapping no.: " + a + " " + b);
        t = a;
        a = b;
        b = t;
        System.out.println("After Swapping no. : " + a + " " + b);
    }
}

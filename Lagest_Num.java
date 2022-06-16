package com.bridgelab.day5;

import java.util.Scanner;

public class Lagest_Num {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        a = sc.nextInt();
        System.out.println("Enter second num: ");
        b = sc.nextInt();
        System.out.println("Enter third num: ");
        c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("Largest num is: " + a);
        }else if(b > c){
            System.out.println("Largest num is: " + b);
        }else{
            System.out.println("Largest num is: " + c);
        }
    }
}

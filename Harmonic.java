package com.bridgelab.day5;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        double result = 0.0;
        System.out.println("The harmonic series is: ");

        while(num>0){
          result = result + (double)1/num;
          num--;
            System.out.println(result);
        }
        System.out.println("The harmonic number for given number: " + result);
    }
}

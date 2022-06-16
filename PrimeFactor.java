package com.bridgelab.day5;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int num, i=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        System.out.println("Prime factor of Number: ");
        while(num>1){
            if(num%i == 0){
                System.out.println(i);
                num = num/i;
            }else{
                i++;
            }
        }
    }
}

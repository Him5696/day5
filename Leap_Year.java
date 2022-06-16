package com.bridgelab.day5;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr = sc.nextInt();
        if(yr%4==0 || yr%100!=0 && yr%400==0){
            System.out.println("Year is leap ");
        }else {
            System.out.println("Year is not leap ");
        }
    }
}

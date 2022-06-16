package com.bridgelab.day5;

import java.util.Scanner;

public class Flip_Coin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;
        System.out.println("please enter the no. : ");
        Scanner n = new Scanner(System.in);
        int flips = n.nextInt();
        while(count <= flips){
         random = Math.random();
            System.out.println(count + "" + random);
            if(random<0.5){
                heads++;
                System.out.println("heads");
            }else{
                tails++;
                System.out.println("tails");
            }
            count++;
        }
        System.out.println("No. of heads : " + heads);
        System.out.println("No. of tails : " + tails);

        double headpercent = (double)heads/flips*100;
        double tailpercent = (double)tails/flips*100;

        System.out.println("% of heads: " + headpercent);
        System.out.println("% of tails: " + tailpercent);
    }
}



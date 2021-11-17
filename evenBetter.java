package com.projects;

import java.util.Scanner;

public class evenBetter {

    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);

        String playAgain = "g";
        System.out.println("A random number has been chosen between 0 and 100 (both included).\nYou have to guess what the number is.\nIf at any point you wish to quit, enter 123.");

        do {
            int num = (int)(Math.random()*100);
            System.out.println("Enter your guess:");
            int g1 = guess.nextInt();
            while (g1!=num&&g1!=123) {
                if (g1<0||g1>100) {
                    System.out.println("Only pick a number between 0 and 100.");
                    g1= guess.nextInt();
                    continue;
                }
                if (g1<num) {
                    System.out.println("The number is larger than that.");
                }
                if (g1>num) {
                    System.out.println("The number is smaller than that.");
                }
                g1 = guess.nextInt();
            }
            if (g1==num) {
                System.out.println("Congrats! You guessed the correct number.\nDo you want to play again?");
            }
            if (g1==123) {
                break;
            }
            playAgain = guess.next();
//            num = (int)(Math.random()*100);
//            g1= guess.nextInt();
        } while ("y".equals(playAgain));
        System.out.println("Goodbye!");
    }
}

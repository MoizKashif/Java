package com.moizkashif;

import java.util.Scanner;
import java.util.Random;

public class CWH_Exercise20_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("********************NOTE******************");
        System.out.println("****Pick Number(Rock = 0),(Paper = 1),(Scissors = 2)****");
        for (int i = 1; i <= 3; i++) {
            int user = sc.nextInt();
            int computer = rand.nextInt(3);

            System.out.println("\nUser Chooses: " + user);
            System.out.println("Computer Chooses " + computer);

            if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)) {
                System.out.println("*****COMPUTER WINS****");
            } else if ((user == 1 && computer == 0) || (user == 2 && computer == 1) || (user == 0 && computer == 2)) {
                System.out.println("****USER WINS****");
            } else if ((user == 1 && computer == 1) || (user == 2 && computer == 2) || (user == 0 && computer == 0)) {
                System.out.println("****ITS A DRAW****");
            } else {
                System.out.println("**** ITS AN INVALID NUMBER!!! PLEASE CHOOSE BETWEEN 0 TO 2 ****");
            }
        }

    }
}

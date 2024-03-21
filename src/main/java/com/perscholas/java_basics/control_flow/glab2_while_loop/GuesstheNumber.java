package com.perscholas.java_basics.control_flow.glab2_while_loop;

import java.util.Scanner;

public class GuesstheNumber {
    public static void main(String[] args) {
        //Generate a random number to be guessed
        int number = (int)(Math.random()*100);
        Scanner sc= new Scanner(System.in);
        int guess =-1;
        while (guess!=number){
            //Prompt the user to guess the number
            System.out.println("Enter your guess: ");
            guess= sc.nextInt();
            if(guess==number){
                System.out.println("Yes the number is : "+ guess);
            }
            else if(guess>number){
                System.out.println("Your number is high");
            }
            else{
                System.out.println("Your number is low");
            }
        }
    }
}

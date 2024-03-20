package com.perscholas.java_basics.control_flow;
/*Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user to determine the letter grade.
Print out “Score out of range” if the score is less than 0 or greater than 100.*/

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(0>marks && 100<marks){
            System.out.println("Score out of range");
        }
        else if(90<=marks && 100>=marks){
            System.out.println("A");
        }
        else if(80<=marks && 89>=marks){
            System.out.println("B");
        }
        else if(70<=marks && 79>=marks){
            System.out.println("C");
        }
        else if(60<=marks && 69>=marks){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }
}

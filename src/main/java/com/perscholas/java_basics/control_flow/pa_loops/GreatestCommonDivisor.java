package com.perscholas.java_basics.control_flow.pa_loops;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //Get the two number
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        //Get the minimum of two numbers
        int min= a<b?a:b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("Greatest Common Divisor of two numbers is : "+i );
                break;
            }
        }
    }
}

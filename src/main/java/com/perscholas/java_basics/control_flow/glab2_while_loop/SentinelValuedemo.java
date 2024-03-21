package com.perscholas.java_basics.control_flow.glab2_while_loop;

import java.util.Scanner;

public class SentinelValuedemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter data(if its zero the program stops): ");
        int data=sc.nextInt();
        while(data!=0){
            sum=sum+data;
            System.out.println("Enter data(if its zero the program stops): ");
            data = sc.nextInt();
        }
        System.out.println(sum);
    }
}

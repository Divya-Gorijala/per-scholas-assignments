package com.perscholas.java_basics.hacker_rank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n=A.length();
        int palindrome=1;
        for(int i=0;i<n;i++){
            if(A.charAt(i)!=A.charAt(n-i-1)){palindrome=0;break;}
        }
        if(palindrome==1){System.out.println("It is a palindrome string");}
        else{System.out.println("It is not a palindrome string");}
    }
}

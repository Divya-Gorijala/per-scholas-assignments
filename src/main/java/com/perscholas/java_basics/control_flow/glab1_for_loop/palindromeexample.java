package com.perscholas.java_basics.control_flow.glab1_for_loop;

import java.util.Scanner;

public class palindromeexample {

    public static void main(String[] args) {
        boolean palindrome=true;
        Scanner sc = new Scanner(System.in);
        String original=sc.nextLine();
        int length = original.length();
        for(int i=0;i<length; i++){
            if(original.charAt(i)!=original.charAt(length-i-1)){
                palindrome=false;
                break;
            }
        }

        if(palindrome){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }

}

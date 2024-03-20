package com.perscholas.java_basics.hacker_rank;

import java.util.ArrayList;
import java.util.Scanner;
//Hello, thanks for attempting this problem! Hope it
// will help you to learn java! Good luck and have a nice day!
public class StringTokens {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int length=0;
        String delimiters = "[ |'|?|,|!]";
        String[] parts= s.split(delimiters);
        for(String str: parts){
            if(!str.isEmpty()){
                System.out.println(str);
                length++;
            }

        }
        System.out.println(length);
        scan.close();
    }
}

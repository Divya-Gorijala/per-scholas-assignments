package com.perscholas.java_basics.arrays.pa_array;

import java.util.Scanner;

public class FavoriteArray {
    public static void main(String[] args) {
        System.out.println("Enter how many favorite string: ");
        Scanner sc= new Scanner(System.in);
        //create ana array
        String[] str_array=new String[sc.nextInt()];
        //assign the favorite elements to string
        sc.nextLine();
        for(int i=0;i<str_array.length;i++){
            System.out.println("Enter favorite elements: ");
            str_array[i]=sc.nextLine();
        }
        //print out the string array
        System.out.print("The string array: ");
        for(String str: str_array){
            System.out.print(str+" ");
        }
    }
}

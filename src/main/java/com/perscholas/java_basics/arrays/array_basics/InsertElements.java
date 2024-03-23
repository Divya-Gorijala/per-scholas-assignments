package com.perscholas.java_basics.arrays.array_basics;

import java.util.Scanner;

public class InsertElements {
    public static void main(String[] args) {
        int i,element;
        int[] arr = new int[11];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 10 elements");
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element to Insert: ");
        element = sc.nextInt();
        arr[i] = element;

        System.out.println("Now the array is: ");
        for (i=0; i<11; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

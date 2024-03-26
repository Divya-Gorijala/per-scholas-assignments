package com.perscholas.java_basics.arrays.pa_array;

import java.util.Arrays;
import java.util.List;

public class AscendingArray {
    public static void main(String[] args) {
        int[] array={4, 2, 9, 13, 1, 0};
        bubbleSort(array);
        //print out the array
        for (int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Smallest element: "+ array[0]);
        System.out.println("Largest element: "+ array[array.length-1]);
    }
    public static void bubbleSort(int[] array){
        int n=array.length;
        boolean swapped;
        do{
            swapped=false;
            for(int i=0;i<n-1;i++) {
                if (array[i]>array[i + 1]) {
                    //Swap the elements
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    swapped = true;
                }
            }
            n--;
        }while(swapped);
    }
}

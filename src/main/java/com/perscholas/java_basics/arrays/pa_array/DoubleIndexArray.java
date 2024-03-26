package com.perscholas.java_basics.arrays.pa_array;

import java.util.Arrays;

/* Write a program where you create an integer array of 5 numbers.
Loop through the array and assign the value of the loop control variable
multiplied by 2 to the corresponding index in the array.
 */
public class DoubleIndexArray {
    public static void main(String[] args) {
        //Declare an array
        int[] array=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]= 2*i;
        }
        System.out.println("Array : "+ Arrays.toString(array));
    }
}

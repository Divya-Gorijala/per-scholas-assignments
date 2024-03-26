package com.perscholas.java_basics.arrays.pa_array;

import java.util.Arrays;

public class VariableAssignArray {
    public static void main(String[] args) {
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            array[i]=i;
        }
        //Print out the array
        System.out.println("Array :"+ Arrays.toString(array));
    }
}

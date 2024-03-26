package com.perscholas.java_basics.arrays.pa_array;

public class ArrayException {
    public static void main(String[] args) {
        //Create integer array
        int[] array = {1,2,3,4,5};
        //Printout value at first index and last index
        System.out.println("First element: "+array[0]+",Last element: "+array[array.length-1]);
        //Print out value at index= length
        //System.out.println(array[array.length]);
        //Print out value at index=5
        System.out.println(array[5]);
    }
}

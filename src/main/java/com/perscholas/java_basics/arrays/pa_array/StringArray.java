package com.perscholas.java_basics.arrays.pa_array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        //create and initialize String array
        String[] array={"red","green","blue","yellow"};
        //prinout the array length
        System.out.println(array.length);
        //Copy the array
        String[] array_copy= array.clone();
        //Print out the string
        System.out.println("String array: "+ Arrays.toString(array_copy));
    }
}

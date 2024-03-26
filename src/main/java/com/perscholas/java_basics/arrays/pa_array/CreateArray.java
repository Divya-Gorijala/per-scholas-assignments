package com.perscholas.java_basics.arrays.pa_array;

public class CreateArray {
    public static void main(String[] args) {
        //create array
        int[] array = new int[3];
        //assign values
        for(int i=0;i<array.length; i++){
            array[i]=i+1;
        }
        //Print out the values
        for(int value : array){
            System.out.println(value);
        }
    }
}

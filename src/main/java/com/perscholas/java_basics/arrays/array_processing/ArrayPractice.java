package com.perscholas.java_basics.arrays.array_processing;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        System.out.println(Arrays.binarySearch(array,4));
        //copyOf method
        int[] copy_of_array=Arrays.copyOf(array,5);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(array,copy_of_array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        double[] dValues = new double[10];
        Arrays.fill(dValues, 50.0);
        System.out.println(Arrays.toString(dValues));
        long[] lValues = new long[5];
        System.out.println(Arrays.toString(lValues));
        //clone array
        int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        sourceArray[2] = 500;
        System.out.println("Source Array :" +Arrays.toString(sourceArray));
        System.out.println("Target Array :" +Arrays.toString(targetArray));
        //array copy
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println("Source Array after arraycopymethod:" +Arrays.toString(sourceArray));
        System.out.println("Target Array after arraycopymethod:" +Arrays.toString(targetArray));
        //initialize array with random values
        double[] doubleArray= new double[5];
        for(int i=0;i<doubleArray.length;i++){
            doubleArray[i] = Math.random();
        }
        //Print out the values
        for(double d : doubleArray){
            System.out.println(d);
        }
    }
}

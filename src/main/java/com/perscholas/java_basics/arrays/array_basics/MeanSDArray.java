package com.perscholas.java_basics.arrays.array_basics;

public class MeanSDArray {
    public static void main(String[] args) {
        //Declare variable
        int[] marks= {74, 43, 58, 60, 90, 70};
        int sum=0;
        //Declare sum of squares
        double sum_of_squares=0;
        //find the sum of numbers and sum of squares
        for(int num : marks){
            sum=sum+num;
        }
        //Get the array length
        int arrayLength=marks.length;
        //mean of Array
        double mean= (double)sum/arrayLength;
        //print out the mean and deviation
        System.out.println("mean is: "+mean);
        //Deviation
        for(int num: marks){
            sum_of_squares= sum_of_squares+(num-mean)*(num-mean);
        }
        double deviation= Math.sqrt(sum_of_squares/arrayLength);

        System.out.println("Deviation is: %.2f%n\","+deviation);

    }
}

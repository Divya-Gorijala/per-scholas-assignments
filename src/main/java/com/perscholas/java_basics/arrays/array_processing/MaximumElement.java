package com.perscholas.java_basics.arrays.array_processing;

public class MaximumElement {
    public static void main(String[] args) {
        int[] myArray={2,30,4,5,6};
        int maxVal = Integer.MIN_VALUE;
        for (int i=0;i<myArray.length;i++){
            if(myArray[i]>maxVal){
                maxVal=myArray[i];
            }
        }
        System.out.println("Maximum value : "+maxVal);
        int[] x = new int[5];
        int i;
        for (i = 0; i < x.length; i++)
            x[i] = i;
        System.out.println(x[i]);


    }
}

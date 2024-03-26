package com.perscholas.java_basics.arrays.array_processing;

public class MinimumElement {
    public static void main(String[] args) {
        int[] myArray={10,2,4,6,8,10};
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i< myArray.length;i++){
            if(myArray[i]<minVal){
                minVal = myArray[i];
            }
        }
        System.out.println("minVal = "+minVal);
    }
}

package com.perscholas.java_basics.arrays.pa_array;
/*Write a program that creates a String array of 5 elements and
swaps the first element with the middle element without creating a
new array.
 */
public class SwapElement {
    public static void main(String[] args) {
        //creat and initialize an arrray
        int[] array={1,2,3,4,5};
        for(int i=0;i<array.length;i++){
            if(i==array.length/2){
                int temp=array[0];
                array[0]=array[i];
                array[i]=temp;
            }
        }
        for(int i: array) {
            System.out.print(i+" ");
        }

    }
}

package com.perscholas.java_basics.arrays.pa_array;
/* Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element,
except for the middle (index 2) element.
 */
public class PrintElements {
    public static void main(String[] args) {
        //Declare an array
        int[] array = {1,2,3,4,5};
        //Loop through the element
        for(int i=0;i<array.length;i++){
            if(i!=2){
                System.out.print(array[i]+" ");
            }
        }
    }
}

package com.perscholas.java_basics.arrays.pa_array;
/*Task 10: Create an array that includes an integer, 3 strings, and 1 double.
 Print the array.
 */

public class ObjectArray {
    public static void main(String[] args) {
        Object[] array={1,"a","b","c",2.1};
        //Print out the array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

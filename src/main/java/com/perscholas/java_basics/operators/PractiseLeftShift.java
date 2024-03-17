/*Write a program that declares an integer a variable x, assigns the value 2 to it,
and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
 Before printing the results, write a comment with the predicted decimal value
 and binary string. Now, print out x in decimal form and in binary notation.
 */

package com.perscholas.java_basics.operators;

public class PractiseLeftShift {
    public static void main(String[] args){
        //Declare variable and assign value
        int x=88;
        //Define a new int and assign Binary value of x
        int xBinary = Integer.parseInt(Integer.toBinaryString(x));
        //Printout the binary value
        System.out.println(xBinary);
        //Use the left shift operator assign x value back to x
        x=x<<1;
        //decimal value -4
        //binary string - 100
        //Print out the decimal value of x
        System.out.println("Decimal value after using binary operator: "+x);
        xBinary=Integer.parseInt(Integer.toBinaryString(x));
        //Print out the binary value of x
        System.out.println("Binary value after using binary operator: "+xBinary);
    }
}

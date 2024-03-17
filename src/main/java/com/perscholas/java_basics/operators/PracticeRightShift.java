package com.perscholas.java_basics.operators;

public class PracticeRightShift {
    public static void main(String[] args){
        //Declare variable and assign value
        int x=225;
        //Define a new int and assign Binary value of x
        int xBinary = Integer.parseInt(Integer.toBinaryString(x));
        //Printout the binary value
        System.out.println(xBinary);
        //Use the left shift operator assign x value back to x
        x=x>>2;
        //decimal value -4
        //binary string - 100
        //Print out the decimal value of x
        System.out.println("Decimal value after using binary operator: "+x);
        xBinary=Integer.parseInt(Integer.toBinaryString(x));
        //Print out the binary value of x
        System.out.println("Binary value after using binary operator: "+xBinary);
    }
}

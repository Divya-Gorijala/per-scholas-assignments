package com.perscholas.java_basics.variables;

public class PracticeTypeCasting {
    public static void main(String[] args) {
        //declare two integers and assign values
        int x = 5;
        int y = 6;
        //Declare q and assign y/x
        int q = y / x;
        //Print out the result
        System.out.println("Result is " + q);
        //Type casting
        double douQ=(double)y/x;
        //Print out the result
        System.out.println("Result after type casting Q to double is " + douQ);
    }
}

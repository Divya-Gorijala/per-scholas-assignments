package com.perscholas.java_basics.variables;

public class DivideIntegers {
    public static void main(String[] args){
        //declare two integers and assign values
        int num1=2;
        int num2=8;
        // Use ternary operator to determine the larger and smaller numbers
        int larger = (num1 > num2) ? num1 : num2;
        int smaller = (num1 < num2) ? num1 : num2;
        //Divide the numbers
        int result = larger / smaller;
        // Print out the result
        System.out.println("result is: " + result);

       //declare double and assign value
        double decimalNum2 = 8.0;
        double douLarger = (num1 > decimalNum2) ? num1: decimalNum2;
        double douSmaller = (num1 < decimalNum2) ? num1 : decimalNum2;

        // Divide the larger number by the smaller number
        double douResult = douLarger/ douSmaller;

        // Print out the result
        System.out.println("After changing the larger number to a decimal, the result is: " + douResult);

    }

}

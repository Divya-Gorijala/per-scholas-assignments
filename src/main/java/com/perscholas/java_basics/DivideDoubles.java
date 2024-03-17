package com.perscholas.java_basics;

public class DivideDoubles {
    public static void main(String[] args) {
        //declare two double variables and assign values
        double num1 = 4.0;
        double num2 = 2.9;
        //find large and small number using ternary operators
        double larger = (num1 > num2) ? num1 : num1;
        double smaller = (num1 < num2) ? num1 : num2;
        //divide large num by small number and assign to a variable
        double result= larger/smaller;
        //Print out the result
        System.out.println("Result is: "+result);
        //After type casting printing out the value
        int typeCastResult=(int)result;
        System.out.println("Result after type casting to integer is: "+typeCastResult);
    }
}

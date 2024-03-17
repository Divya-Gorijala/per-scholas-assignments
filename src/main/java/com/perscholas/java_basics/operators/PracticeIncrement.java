package com.perscholas.java_basics.operators;

public class PracticeIncrement {
    public static void main(String[] args){
        //Declare variable and assign values
        int x= 5;
        int y=8;
        //Declare the sum and get the sum value
        int sum=sum(x,y);
        //Print out the sum value
        System.out.println(sum);
        //increment the operator
        x++;
        sum=sum(x,y);
        //Print out the sum
        System.out.println(sum);
        x++;
        //Print out the sum
        sum=sum(x,y);
        //Print out the sum
        System.out.println(sum);
    }
    public static int sum(int x,int y){
        return x+y;
    }
}

package com.perscholas.java_basics.operators;

public class IncrementVariables {
    public static void main(String[] args){
        int x=10;
        //Print out the x value
        System.out.println("Value before the increment: "+x);
        //Add 1 to x and print the value
        x=x+1;
        //Printout the x value
        System.out.println("After first increment: "+x);
        //Increment x by postfix operator
        x++;
        //Printout the x value
        System.out.println("After second increment: "+x);
        //Increment x by postfix operator
        ++x;
        //Printout the x value
        System.out.println("After third increment: "+x);
    }
}

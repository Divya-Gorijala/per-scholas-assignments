package com.perscholas.java_basics.control_flow;

public class StudentPass
{
    public static void main(String s[])
    {
        int marks = 80;
        if( marks > 70 )
            System.out.println("Distinction");
        if( marks > 35 )
            System.out.println("Pass");
        else
            System.out.println("Fail");
        System.out.println("Better luck next time");
    }
}


package com.perscholas.java_basics.control_flow;

import static java.lang.Math.PI;

public class IfStatement {
    public static void main(String[] args) {
        int radius =-10;
        double area;

        int number=10;
        if (radius >= 0)
        {
            area = radius*radius*PI;
            System.out.println( "The area for the circle of radius " + radius + " is " + area);
        }

        boolean even = number %2==0;
        System.out.println(even);
    }
}

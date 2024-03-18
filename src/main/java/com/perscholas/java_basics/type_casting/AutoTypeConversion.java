package com.perscholas.java_basics.type_casting;

public class AutoTypeConversion {
    public static void main(String[] args){
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q= 10.60f;
        //int z=x+y;// Error ; cannot convert from double to int.
        double z= x+y;
        System.out.println("Sum of two numbers: "+ z);
        //Long r = p-q //Error; cannot convert float to Long
        float r = p-q;
        System.out.println("Subtraction of two numbers: "+r);
    }
}

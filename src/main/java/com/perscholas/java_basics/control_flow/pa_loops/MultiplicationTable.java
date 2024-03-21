package com.perscholas.java_basics.control_flow.pa_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int j=1;j<=12;j++) {
            for (int i = 1; i <= 12; i++) {
                System.out.print(i*j + "  ");
            }
            System.out.println();
        }
    }
}

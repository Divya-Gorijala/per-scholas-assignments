package com.perscholas.java_basics.control_flow.pa_loops;

public class PredictFutureTution {
    public static void main(String[] args) {
        int act_fees=10000;
        double fees=10000;
        int year=0;
        while (fees<2*act_fees){
            fees= 1.07*fees;
            year++;
        }
        System.out.println("It will take "+year+" years for fees to get doubled");
    }
}

package com.perscholas.java_basics.control_flow.glab_for_loop;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        //for loop
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum= "+sum);
    }
}

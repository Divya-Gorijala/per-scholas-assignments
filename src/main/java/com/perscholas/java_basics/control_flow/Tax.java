package com.perscholas.java_basics.control_flow;

import java.util.Scanner;

/*There are four filing statuses: Single, Married Filing Jointly,
Married Filing Separately, and Head of Household.
 */
public class Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter status");
        String str=sc.nextLine();
        System.out.println("Enter salary");
        int salary=sc.nextInt();
        switch (str){
            case "Single":
                if(0<=salary && salary<=8350){
                    System.out.println(.1*salary);
                }
                else if(8351<=salary && salary<=33950){
                    System.out.println(.15*salary);
                }
                else if(33951<=salary && salary<=82250){
                    System.out.println(.25*salary);
                }
                else if(82251<=salary && salary<=171550){
                    System.out.println(.28*salary);
                }
                else if(171551<=salary && salary<=372950){
                    System.out.println(.33*salary);
                }
                else{
                    System.out.println(.35*salary);
                }
                break;
            case "Married Filing Jointly":
                if(0<=salary && salary<=16700){
                    System.out.println(.1*salary);
                }
                else if(16701<=salary && salary<=67900){
                    System.out.println(.15*salary);
                }
                else if(67901<=salary && salary<=137050){
                    System.out.println(.25*salary);
                }
                else if(137051<=salary && salary<=208850){
                    System.out.println(.28*salary);
                }
                else if(208851<=salary && salary<=372950){
                    System.out.println(.33*salary);
                }
                else{
                    System.out.println(.35*salary);
                }
                break;
            case "Married Filing Separately":
                if(0<=salary && salary<=8350){
                    System.out.println(.1*salary);
                }
                else if(8351<=salary && salary<=33950){
                    System.out.println(.15*salary);
                }
                else if(33951<=salary && salary<=68525){
                    System.out.println(.25*salary);
                }
                else if(68526<=salary && salary<=104425){
                    System.out.println(.28*salary);
                }
                else if(104426<=salary && salary<=186475){
                    System.out.println(.33*salary);
                }
                else{
                    System.out.println(.35*salary);
                }
                break;
            case "Head of Household":
                if(0<=salary && salary<=11950){
                    System.out.println(.1*salary);
                }
                else if(11951<=salary && salary<=45500){
                    System.out.println(.15*salary);
                }
                else if(45501<=salary && salary<=117450){
                    System.out.println(.25*salary);
                }
                else if(117451<=salary && salary<=190200){
                    System.out.println(.28*salary);
                }
                else if(190201<=salary && salary<=372950){
                    System.out.println(.33*salary);
                }
                else{
                    System.out.println(.35*salary);
                }
                break;
        }
    }
}

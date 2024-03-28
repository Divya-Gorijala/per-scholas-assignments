package com.perscholas.java_basics.encapsulation.pa_polymorphism_and_interface;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kd1 =new KidUser(10,"Kids");
        kd1.registerAccount();
        kd1.requestBook();

        System.out.println();
        KidUser kd2 =new KidUser(18,"Fiction");
        kd2.registerAccount();
        kd2.requestBook();

        System.out.println();
        AdultUser ad =new AdultUser(5,"Kids");
        ad.registerAccount();
        ad.requestBook();
    }
}

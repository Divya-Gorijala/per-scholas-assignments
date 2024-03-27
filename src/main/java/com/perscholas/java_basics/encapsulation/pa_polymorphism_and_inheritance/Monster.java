package com.perscholas.java_basics.encapsulation.pa_polymorphism_and_inheritance;

class Monster {
    String name;

    // Constructor
    public Monster(String name) {
        this.name = name;
    }
    // Method to attack (defined in the superclass)
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}

package com.perscholas.java_basics.encapsulation.pa_polymorphism_and_inheritance;

class FireMonster extends Monster {

    public FireMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with fire!";
    }

}

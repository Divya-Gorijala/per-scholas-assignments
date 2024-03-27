package com.perscholas.java_basics.encapsulation.pa_polymorphism_and_inheritance;

class StoneMonster extends Monster {
    public StoneMonster(String name){
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with stones!";
    }
}

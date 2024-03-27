package com.perscholas.java_basics.encapsulation.pa_polymorphism_and_inheritance;

class WaterMonster extends Monster{
    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with water!";
    }
}

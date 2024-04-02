package com.perscholas.java_basics.encapsulation.practise.inheritance;

 class LivingThing {
    //field and method of the parent class
    protected String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Human extends LivingThing {

    public void display() {
        System.out.println("My name is: "+name);
    }
}

    public class InheritanceMain {

    public static void main(String[] args) {
        System.out.println("Hello Word!");
        Human Hob=new Human();
        Hob.name="Divya";
        Hob.display();
        Hob.eat();
    }
}

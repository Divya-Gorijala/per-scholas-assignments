package com.perscholas.java_basics.encapsulation.practise.inheritance;


    class Living {
        //field and method of the parent class
        protected String name;
        public void eat(){
            System.out.println("I can eat");
        }
    }

    class HumanBeing extends Living {
        public void eat(){
            System.out.println("I enjoy eating pizza with softdrink");
        }

        public void communicate() {
            System.out.println("I can communicate by language");
        }
    }

public class OverridingMain {
        public static void main(String[] args) {
            System.out.println("Hello Word!");
            HumanBeing HB=new HumanBeing();
            HB.eat();
            HB.communicate();

            Living l=new Living();
            l.eat();
        }
    }

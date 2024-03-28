package com.perscholas.java_basics.encapsulation.hacker_rank.abstract_practice;

import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book{
//    public MyBook(){
//
//    }
    @Override
    void setTitle(String s){
        title =s;
    }
}

public class AbstractSolution{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}
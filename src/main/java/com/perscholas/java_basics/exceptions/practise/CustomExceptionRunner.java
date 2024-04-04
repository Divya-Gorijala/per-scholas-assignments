package com.perscholas.java_basics.exceptions.practise;

public class CustomExceptionRunner {
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");
            throw new CustomException("This is my error message");
        }
        catch (CustomException e){
            System.out.println("catch block");
            System.out.println(e);
        }
    }
}

class CustomException extends Exception{
    private String str1;
    CustomException(String str2){
        this.str1=str2;
    }
    public String toString(){
        return(" --->> MyException Occured: "+str1);
    }
}



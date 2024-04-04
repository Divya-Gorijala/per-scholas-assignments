package com.perscholas.java_basics.exceptions.practise;

public class CustumExceptionExample2 {
    public static void main(String[] args) {
        ProductInfo obj = new ProductInfo();
        try{
            obj.productCheck(60);
        }
        catch (InvalidProductException e){
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
    }
}

class InvalidProductException extends Exception
{
    public InvalidProductException(String s){
        super(s);
    }
}

class ProductInfo {
    public void productCheck(double weight) throws InvalidProductException{
        if(weight<100){
            throw new InvalidProductException("Product weight is low");
        }
    }
}

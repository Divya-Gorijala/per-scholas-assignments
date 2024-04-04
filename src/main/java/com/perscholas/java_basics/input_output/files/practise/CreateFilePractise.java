package com.perscholas.java_basics.input_output.files.practise;

import java.io.File;
import java.io.IOException;

public class CreateFilePractise {
    public static void main(String[] args) {
        try{
            File f= new File("/Users/venkatasai/Desktop/perscholas/" +
                    "class1/test-demo/src/main/java/com/perscholas/java_basics/" +
                    "input_output/files/practise/practise2");
            if(f.createNewFile()){
                System.out.println("practise2 is created");
            }
            else{
                System.out.println("practise2 file already exists");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package com.perscholas.java_basics.input_output.files.practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileContentScanner {
    public static void main(String[] args) {
        try{
            File f = new File("/Users/venkatasai/Desktop/perscholas/class1" +
                    "/test-demo/src/main/java/com/perscholas/java_basics/input_output" +
                    "/files/practise/FileBasic.java");
            Scanner sc= new Scanner(f);
            String data="";
            while(sc.hasNextLine()){
                data= sc.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){

        }
    }
}

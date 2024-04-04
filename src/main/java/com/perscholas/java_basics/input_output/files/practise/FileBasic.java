package com.perscholas.java_basics.input_output.files.practise;

import java.io.File;
import java.util.Arrays;

public class FileBasic {
    public static void main(String[] args) {
        String path = "/Users/venkatasai/Desktop/perscholas/" +
                "class1/test-demo/src/main/java/com/perscholas/java_basics/" +
                "input_output/files/practise/practise";
        File dir = new File(path);
        System.out.println("File Name "+dir.getName());
        System.out.println("File Name "+dir.getPath());
        System.out.println("Is path absolute: " + dir.isAbsolute());
        System.out.println("Return Absolute path of the File " + dir.getAbsolutePath());
        System.out.println("File is Exist " + dir.exists());
        System.out.println(dir.exists() ? "Yes file exists" : "file does not exist");
        if(dir.exists())  // return true or False
        {
            System.out.println("File is Found");
            System.out.println("IS file Readable " +  dir.canRead());
            System.out.println("IS file Writable " +  dir.canWrite());
            System.out.println("File size in a bytes " + dir.length()); // file size in byte
        }

//        System.out.println(dir.isDirectory());
//        File[] FilewithPath =  dir.listFiles(); // return an  Array of Files
//        System.out.println(Arrays.toString(FilewithPath));

    }
}

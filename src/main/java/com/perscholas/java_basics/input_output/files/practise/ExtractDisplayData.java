package com.perscholas.java_basics.input_output.files.practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtractDisplayData {
    public static void main(String[] args)  {
        try {
            File f = new File("/Users/venkatasai/Desktop/perscholas/class1/test-demo" +
                    "/src/main/java/com/perscholas/java_basics/input_output/files/practise" +
                    "/CourseData.csv");
            Scanner sc = new Scanner(f);
            ArrayList<Course> data = new ArrayList<Course>();
            while (sc.hasNextLine()){
                String Line = sc.nextLine();
                String[] lineSplit=Line.split(",");
                Course course= new Course(lineSplit[0],lineSplit[1],lineSplit[2]);
                data.add(course);
            }
            for (Course c : data){
                System.out.println(c.getCode() +"|"+ c.getCourseName()+"|"+c.getInstructorName());
            }

        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}


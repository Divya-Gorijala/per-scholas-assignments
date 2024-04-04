package com.perscholas.java_basics.input_output.files.practise;

public class Course{
    private String code, course_name, instructor_name;

    public Course(){}

    public Course(String code,String course_name,String instructor_name){
        this.code=code;
        this.course_name=course_name;
        this.instructor_name=instructor_name;
    }

    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }

    public void setCourseName(String course_name){
        this.course_name=course_name;
    }
    public String getCourseName(){
        return course_name;
    }

    public void setInstructorName(String instructor_name){
        this.instructor_name=instructor_name;
    }
    public String getInstructorName(){
        return instructor_name;
    }

}

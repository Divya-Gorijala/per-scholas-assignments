package com.perscholas.java_basics.encapsulation.practise;

public class Student {

    String first_name;
    String last_name;
    String  emailId;
    String Student_Phone;
    public Student(){}

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setStudent_Phone(String student_Phone) {
        Student_Phone = student_Phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getStudent_Phone() {
        return Student_Phone;
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.setFirst_name("Divya");
        System.out.println(s.getFirst_name());
    }
}

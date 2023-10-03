package com.example.Spring1_Revision;

public class Student {

    private String name;

    private int age;

    private int admnNo;

    private String course;

    public Student() {
    }

    public Student(String name, int age, int admnNo, String course) {
        this.name = name;
        this.age = age;
        this.admnNo = admnNo;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


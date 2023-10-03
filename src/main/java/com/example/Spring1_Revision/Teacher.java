package com.example.Spring1_Revision;

public class Teacher {

    private String name;

    private int age;

    private int id;

    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, int id, String subject) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.subject = subject;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }
}

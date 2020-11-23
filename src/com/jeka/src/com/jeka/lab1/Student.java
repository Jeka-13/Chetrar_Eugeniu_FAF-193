package com.jeka.lab1;

public class Student { //initialize Class Student
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) { //Create constructor of the class
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public void setName(String name) {
        this.name = name;
    } //setter of the name

    public void setAge(int age) {
        this.age = age;
    } //of the age

    public void setMark(double mark) { //of the mark
        this.mark = mark;
    }
    public String getName(){ //because of private section we should write getter
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getMark(){
        return mark;
    }
}

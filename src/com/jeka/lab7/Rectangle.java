package com.jeka.lab7;

public class Rectangle extends Figure{
    private double a;
    private double b;

    Rectangle(){}
    Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    @Override
    double getArea() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return 2*(a+b);
    }
}

package com.jeka.lab7;

public class Square extends Figure{
    private double a;

    Square(){}

    Square(double a){
        this.a = a;
    }

    @Override
    double getArea() {
        return a*a;
    }

    @Override
    double getPerimeter() {
        return 4*a;
    }
}

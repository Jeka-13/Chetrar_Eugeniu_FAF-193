package com.jeka.lab7;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    Triangle(){}

    Triangle (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
   double getArea() {
        double p, s;
        p=(double)(a+b+c)/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}

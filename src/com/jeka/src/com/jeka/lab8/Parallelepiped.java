package com.jeka.lab8;

public class Parallelepiped implements GeometricBody{

    private double a,b,c;

    Parallelepiped(){}

    Parallelepiped(double a, double b, double c){
        this.a=a;
        this.b = b;
        this.c=c;
    }


   public double getSurface() {
        return 2*(a*c+c*b+a*b);
    }


   public double getVolume() {
        return a*b*c;
    }
}

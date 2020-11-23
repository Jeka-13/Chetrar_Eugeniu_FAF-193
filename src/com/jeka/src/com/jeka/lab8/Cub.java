package com.jeka.lab8;

public class Cub implements GeometricBody{
    private double a;

    Cub(){};

    Cub(double a){
        this.a=a;
    }

    public double getSurface() {
        return 6 * Math.pow(a, 2);
    }

    public double getVolume() {
        return Math.pow(a,3);
    }
}

package com.jeka.lab8;

public class Sphere implements GeometricBody{
    private int radius;

    Sphere(){}

    Sphere(int radius){
        this.radius=radius;
    }

   public double getSurface() {
        return 4*Math.PI*Math.pow(radius, 2);
    }

   public double getVolume() {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }
}

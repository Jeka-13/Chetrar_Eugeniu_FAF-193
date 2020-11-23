package com.jeka.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Cub cub = new Cub(6);
       Parallelepiped parallelepiped = new Parallelepiped(5, 4, 6);
       Sphere sphere = new Sphere(4);

        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();
        geometricBodies.add(cub);
        geometricBodies.add(parallelepiped);
        geometricBodies.add(sphere);

        GeometricBodyController geometricBodyController = new GeometricBodyController();
        geometricBodyController.getList(geometricBodies);
        System.out.println("Now will be printed best Surface " + geometricBodyController.getBestSurface());
        System.out.println("Now will be printed best Volume " + geometricBodyController.getBestVolume());


    }
}

package com.jeka.lab2;

public class Main {

    public static void main(String[] args) {
        //1 task
        Box B1 = new Box(); //first constructor
        Box B2 = new Box(5); //second constructor
        Box B3 = new Box(2,3,4); //third constructor
        System.out.println("B1 has depth "+B1.getDepth()+" height "+ B1.getHeight()+" and width "+B1.getWidth());
        System.out.println("B2 has depth "+B2.getDepth()+" height "+ B2.getHeight()+" and width "+B2.getWidth());
        System.out.println("B3 has depth "+B3.getDepth()+" height "+ B3.getHeight()+" and width "+B3.getWidth());
        System.out.println("--------------------------------------------------------------------------");
        B1.Volume();
        B2.Volume();
        B3.Volume();
        System.out.println("--------------------------------------------------------------------------");
        B1.SurfaceArea();
        B2.SurfaceArea();
        B3.SurfaceArea();
        System.out.println("------------------------------2 task& 3 task ---------------------------------------");
        Queue q1 = new Queue();
        Queue q2 = new Queue(5);
        q2.push(B1); //add element
        q2.push(B2);
        q2.push(B3);
        q2.fullcheck(); // check if we have free elements
        q1.push(new Box());
        q1.push(new Box());
        q1.push(new Box());
        q1.fullcheck(); //will print that this Queue doesn't have ending


    }
}

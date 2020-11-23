package com.jeka.lab7;

import java.util.ArrayList;

class Circle extends Figure{
 private double radius;

 Circle(){}

 Circle(double radius){
     this.radius=radius;
 }
    @Override
    double getArea() {
        return Math.PI*radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }
}

public class Main {
    public static void main(String[] args) {
    Square square = new Square(5);
    Rectangle rectangle = new Rectangle(2,3);
    Triangle triangle = new Triangle(1,4,5);

     ArrayList<Figure> figures = new ArrayList<>();
     figures.add(square);
     figures.add(rectangle);
     figures.add(triangle);

     FigureController figureController = new FigureController();
     figureController.Analyse(figures);

     System.out.println(figureController.getBestAria());
     System.out.println(figureController.getBestPerimeter());
     System.out.println("-------------------------------------");

     //Now, we start for 10
     Circle circle = new Circle(10);
     System.out.println(circle.getArea());
     System.out.println(circle.getPerimeter());

     figures.add(circle);
     figureController.Analyse(figures);
     System.out.println(figureController.getBestAria());
     System.out.println(figureController.getBestPerimeter());

    }
}

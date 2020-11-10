package com.jeka.lab7;

import com.jeka.lab5.A;

import java.util.ArrayList;

public class FigureController {
   private ArrayList<Figure> temp = new ArrayList<>();

    public void Analyse(ArrayList<Figure> list){
       temp.addAll(list);
   }

   public double getBestAria(){
        double value=0;
        for(int i=0; i<temp.size(); i++){
            if(temp.get(i).getArea()>value){
                value=temp.get(i).getArea();
            }
        }
        return value;
   }

   public double getBestPerimeter(){
        double value=0;
        for (int i=0; i<temp.size(); i++){
            if(temp.get(i).getPerimeter()>value){
                value=temp.get(i).getPerimeter();
            }
        }
        return value;
   }


}

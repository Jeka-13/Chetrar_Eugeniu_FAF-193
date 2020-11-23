package com.jeka.lab8;

import java.util.ArrayList;

public class GeometricBodyController {

    private ArrayList<GeometricBody> temp = new ArrayList<>();

    public void getList(ArrayList<GeometricBody> list){
        temp.addAll(list);
    }

    public double getBestSurface(){
        double value=0;
        for(GeometricBody answer : temp){
            if(answer.getSurface()>value){
                value=answer.getSurface();
            }
        }
        return value;
    }

    public double getBestVolume(){
        double value=0;
        for(GeometricBody answer : temp){
            if(answer.getVolume()>value){
                value=answer.getVolume();
            }
        }
        return value;
    }
}

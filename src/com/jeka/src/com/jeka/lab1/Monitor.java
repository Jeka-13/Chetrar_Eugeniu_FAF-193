package com.jeka.lab1;

public class Monitor {
     private String name; //I have added it by my own, I'll use it when will compare
    private String color;
    private Resolution res = new Resolution();
    private Dimension dim = new Dimension();

    public static class Resolution {
        int x, y;

    }

    public static class Dimension {
        int a, b;
    }

    public Monitor(String name, String color, int res_x, int res_y, int dim_a, int dim_b) { //constructor
        this.name = name;
        this.color = color;
        res.x = res_x;
        res.y = res_y;
        dim.a = dim_a;
        dim.b = dim_b;
    }

    public void setColor(String color) { //Setter for color
        this.color = color;
    }

    public void setRes(int x, int y) {
        this.res.x = res.x;
        this.res.y = res.y;
    }

    public void setDim(int a, int b) {
        this.dim.a = dim.a;
        this.dim.b = dim.b;
    }
    public Dimension getDim() {
        return dim;
    }
    public Resolution getRes() {
        return res;
    }
    public String getColor() {
        return color;
    }

    public String getName(){return name;}
}

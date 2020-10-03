package com.jeka.lab2;

public class Box {
    private int height;
    private int width;
    private int depth;

    public Box() {
        height = 1;
        width = 1;
        depth = 1;
    }

    public Box(int value){
        height=width=depth=value;
    }

    public Box(int height, int width, int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public void Volume(){
        int volume = this.depth*this.width*this.height;
        System.out.println("The volume of the box is equal to " + volume);
    }
    public void SurfaceArea(){
        int area = 2*(this.height*this.width+this.height*this.depth+this.width*this.depth);
        System.out.println("The surface area of the box is equal to " + area);
    }
}

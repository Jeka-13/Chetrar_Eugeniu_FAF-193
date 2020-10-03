package com.jeka.lab2;

import java.util.ArrayList;

public class Queue {
    private boolean fixedsize; //chech if was used constructor whit param or without
    private int value;
    private int maxsize;
    private int curIndex;
    private int delIndex = 1;
    private ArrayList<Box> box_list = new ArrayList<Box>();

    public Queue(){
        fixedsize = false;
        this.box_list=new ArrayList<>();
    }
    public Queue(int maxsize){
        fixedsize = true;
        this.maxsize=maxsize;
        this.box_list=new ArrayList<>(maxsize);
    }

    public void push(Box box) {
        if(this.fixedsize || this.curIndex<=this.maxsize){
            this.box_list.add(curIndex, box);
            this.curIndex++;
        } else if(!fixedsize){
            this.box_list.add(curIndex, box);
        }
        else {
            System.out.println("Element could be added : array is full!");
        }
    }
    public void fullcheck(){
        if(fixedsize){
            int a = maxsize - this.box_list.size();
            System.out.println("The number of free elements in Queue is equal to " + a);
        }
        else {
            System.out.println("This Queue has no ending");
        }
    }
    public void pop(){
        if(this.curIndex==0||this.delIndex>this.curIndex){
            System.out.println("The Queuq is empty, that's why element can't be deleted");
        }
        else {
            this.box_list.remove(delIndex);
            this.delIndex++;
        }
    }
    public void print(){
        System.out.println(this.box_list);
    }
}

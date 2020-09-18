package com.jeka;

import java.util.ArrayList; //Использовал ArrayList, чтобы не играть с динамическим массивом

public class Main {

//1 Part

    public static class Monitor{
        String name; //Задаю дополнительные параметр, который не просили для задания имени, буду использовать в сравнении
        String color;  //использую строковую переменную для задания цвета
        Resolution res = new Resolution();
        Dimension dim = new Dimension();
        public static class Resolution{
            int x, y;   //Разрешение прописывается в две величины, поэтому решил использовать отдельный класс.

        }
        public static class Dimension{  //Размеры тоже в две величины.
            int a, b;
        }

        public Monitor(String name,String color, int res_x, int res_y, int dim_a, int dim_b){ //создаю конструктор класса
            this.name=name;
            this.color=color; //использовал this для сравнения его реализации в Java с C++
            res.x = res_x; //присваиваю передаваемые значения
            res.y = res_y;
            dim.a = dim_a;
            dim.b = dim_b;
        }

        public void setColor(String color){ //Это сеттер, который будет преопределять цвет монитора
            this.color=color;
        }
        public void setRes(int x, int y){ //Это сеттер, который будет преопределять разрешение монитора
            this.res.x=res.x;
            this.res.y=res.y;
        }
        public void setDim(int a, int b){ //Это сеттер, который будет преопределять размер монитора
            this.dim.a=dim.a;
            this.dim.b=dim.b;
        }
    }
    public static boolean compareDisplays(Monitor M1, Monitor M2){ //Функция, которая сравнивает разрешения и размеры
        if(M1.dim.a+M1.dim.b > M2.dim.a+M2.dim.b && M1.res.x+M1.res.y > M2.res.x+M2.res.y)
            return true;
        else return false;
    }


// 2 Part

    public static class Student{ // создаем класс Student
        String name;
        int age;
        double mark;

        public Student(String name, int age, double mark){ //создаем конструктор класса Student
            this.name = name;
            this.age = age;
            this.mark = mark;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setMark(double mark){
            this.mark = mark;
        }
    }

    public static class University{ //Создаем класс University
        String name;
        int found_year;
        ArrayList<Student> student_list = new ArrayList<Student>(0);

        public University(String name, int found_year){ //Создаем конструктор класса
            this.name = name; this.found_year = found_year;
        }
        public void addStudent(Student stud){ //Функция, добавляющая студент
            student_list.add(stud);
        }
        public double average(){ //функция, вычисляющая средний балл
            double sum = 0.f;
            for(int i = 0; i < student_list.size(); i++)
                sum += student_list.get(i).mark;
            return sum/student_list.size();
        }
    }

    public static void main(String[] args) {
// Execution of the 1 Part
        Monitor M1 = new Monitor("Samsung","red",1920, 1080, 18, 12);
        Monitor M2 = new Monitor("Acer","blue",2560, 1600, 16, 10);

        if(compareDisplays(M1, M2)){
            System.out.println(M1.name + " has better resolution and dimension than " + M2.name);
            System.out.println(M1.name + " has " + M1.color + " but "+ M2.name + " has " + M2.color);
        }
        else {
            System.out.println(M2.name + " has better resolution and dimension than " + M1.name);
            System.out.println(M2.name + " has " + M2.color + " but "+ M1.name + " has " + M1.color);
        }
// Execution of the 2 and 3 part
        University UTM = new University("UTM", 1964);
        University ULIM = new University("ULIM", 1992);
        University ASEM = new University("ASEM", 1991);

        ASEM.addStudent(new Student("Oxana", 19, 10.00));
        ASEM.addStudent(new Student("Valeria", 20, 8.00));
        ASEM.addStudent(new Student("Maxim", 19, 7.95));
        System.out.println(ASEM.average());

        ULIM.addStudent(new Student("Andrei", 21, 9.25));
        ULIM.addStudent(new Student("Ivan", 20, 7.89));
        ULIM.addStudent(new Student("Mihail", 20,8.01));
        System.out.println(ULIM.average());

        UTM.addStudent(new Student("Eugen", 20, 5.00));
        UTM.addStudent(new Student("Nichita", 20, 7.16));
        UTM.addStudent(new Student("Alexandr", 19, 9.29));
        System.out.println(UTM.average());

    }
}

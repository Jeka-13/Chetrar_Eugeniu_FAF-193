package com.jeka.lab1;

public class Main {

    public static boolean compareDisplays(Monitor M1, Monitor M2) {
            if (M1.getDim().a + M1.getDim().b > M2.getDim().a + M2.getDim().b
                    && M1.getRes().x + M1.getRes().y > M2.getRes().x + M2.getRes().y)
                return true;
            else return false;
        }


        public static void main(String[] args) {
// Execution of the 1 Part
            Monitor M1 = new Monitor("Samsung", "red", 1920, 1080, 18, 12);
            Monitor M2 = new Monitor("Acer", "blue", 2560, 1600, 16, 10);

            if (compareDisplays(M1, M2)) {
                System.out.println(M1.getName() + " has better resolution and dimension than " + M2.getName());
                System.out.println(M1.getName() + " has " + M1.getColor() + " but " + M2.getName() + " has " + M2.getColor());
            } else {
                System.out.println(M2.getName() + " has better resolution and dimension than " + M1.getName());
                System.out.println(M2.getName() + " has " + M2.getColor() + " but " + M1.getName() + " has " + M1.getColor());
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
            ULIM.addStudent(new Student("Mihail", 20, 8.01));
            System.out.println(ULIM.average());

            UTM.addStudent(new Student("Eugen", 20, 5.00));
            UTM.addStudent(new Student("Nichita", 20, 7.16));
            UTM.addStudent(new Student("Alexandr", 19, 9.29));
            System.out.println(UTM.average());

        }
    }


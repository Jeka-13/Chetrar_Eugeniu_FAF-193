package com.jeka.lab4;

import java.io.*;


public class Main {
    public static void main(String[] args){

        String expression = " ";

        try {
            File file = new File("one_expression.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                new Algorithm().start(line);
                System.out.println("----------------------------------");
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("three_expressions.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                new Algorithm().start(line);
                System.out.println("----------------------------------");
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

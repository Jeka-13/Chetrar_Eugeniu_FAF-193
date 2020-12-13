package com.jeka.lab9;

public class InvalidOperandException extends Exception{
    protected String log = "Operand is invalid!";

    public InvalidOperandException() {}

    public void logPrint() {
        System.out.println(this.log);
    }
}

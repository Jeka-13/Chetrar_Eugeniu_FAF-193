package com.jeka.lab9;

public class UnluckyException extends Exception{
    protected String log = "Your number equals 13. So unlucky!";

    public UnluckyException() {}

    public void logPrint() {
        System.out.println(this.log);
    }
}

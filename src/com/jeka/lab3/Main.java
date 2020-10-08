package com.jeka.lab3;

import javax.lang.model.type.TypeVariable;

public class Main {

    public static void main(String[] args){
    String text = "Remember, remember the fifth of November,\n" +
            "Gunpowder treason and plot,\n" +
            "I see no reason why gunpowder treason\n" +
            "Should ever be forgot.\n" +
            "Guy Fawkes, Guy Fawkes,\n" +
            "It was his intent —\n" +
            "To blow up the King and the Parliament.\n" +
            "Three score barrels of powder below,\n" +
            "Poor old England to overthrow:\n" +
            "By God’s mercy he was catch’d\n" +
            "With a dark lantern and burning match.\n" +
            "Holloa, boys, make the bells ring.\n" +
            "Holloa, boys, God save the King!\n" +
            "Hip hip hoorah!"; 

    TextAnalyze myText = new TextAnalyze(text);
    myText.printData();
    }
}

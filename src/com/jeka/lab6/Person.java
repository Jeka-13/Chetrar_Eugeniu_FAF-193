package com.jeka.lab6;

import java.util.ArrayList;
import java.util.Date;

public class Person {
    private String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;

    private FullName name;

    private Date birthDate;

    private Gender gender;

    private String homeAddress;

    private String phone;

    protected class FullName{
        String name = givenName + " " + middleName + " " + familyName;

    }

    enum Gender{
        Male,
        Female
    }

    ArrayList<Hospital> hospitals;
}

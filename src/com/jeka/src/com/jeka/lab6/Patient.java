package com.jeka.lab6;

import java.util.*;


public class Patient extends Person{
    ArrayList<OperationsStaff> operationsStaffs;

    private String id;
    private String[] sickness;
    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;

    private int age;

    private Date birthDate;
    private Date accepted;

    private Gender gender;

    private FullName name;


}

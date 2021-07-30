package com.company.Creational;

public class Prototype implements Cloneable{
     private String alan1;
     private String alan2;

    public Prototype(String alan1, String alan2) {
        this.alan1 = alan1;
        this.alan2 = alan2;
    }

    public String getAlan1() {
        return alan1;
    }

    public void setAlan1(String alan1) {
        this.alan1 = alan1;
    }

    public String getAlan2() {
        return alan2;
    }

    public void setAlan2(String alan2) {
        this.alan2 = alan2;
    }

    @Override
    public Prototype clone()  {
        return new Prototype(alan1,alan2);
    }
}

package com.company;

import com.company.Creational.Prototype;
import com.company.Creational.Singleton;

public class Main {

    public static void main(String[] args) {
      Singleton sign=Singleton.getins();
      Singleton sign2=Singleton.getins();

      sign.setS("hello");
      sign2.setS("hgelasdasd");
      System.out.println(sign.getS());
      System.out.println(sign2.getS());


        Prototype prototype=new Prototype("hi","ho");
        Prototype prototype1=prototype.clone();
        prototype1.setAlan1("merhaba");
        System.out.println(prototype.getAlan1()+prototype.getAlan2());
        System.out.println(prototype1.getAlan1()+prototype1.getAlan2());
    }
}

package com.company.Creational;

public class Singleton {
        private String s="merhaba";
  private static   Singleton ins;


    private Singleton(){}



    public static Singleton getins(){
        if(ins==null){
          return   ins=new Singleton();
        }
        else
            return ins;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}

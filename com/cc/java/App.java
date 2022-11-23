package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        int kontoStand = 10000;
        
        Konto konto1 = new Konto("Konto1", kontoStand, (kontoStand * 2));
        output(konto1.getName());
        output(String.valueOf(konto1.getKontoStand()));
        output(String.valueOf(konto1.getNeuKontoStand()));

        output("Erster Konto ist :" + konto1.getName() + ". Der Kontostand war: "
        + konto1.getKontoStand() + ". Der neuer Kontostand ist " + konto1.getNeuKontoStand() + ".") ;


        output("-------------------------------");

        Konto konto2 = new Konto("Konto2", kontoStand , (kontoStand * 3));
        output(konto2.getName());
        output(String.valueOf(konto2.getKontoStand()));
        output(String.valueOf(konto2.getNeuKontoStand()));

        output("Zweiter Konto ist :" + konto2.getName() + ". Der Kontostand war: "
         + konto2.getKontoStand() + ". Der neuer Kontostand ist " + konto2.getNeuKontoStand()) ;

        output("-------------------------------");

        Konto konto3 = new Konto("Konto3", kontoStand, (kontoStand * 10));
        output(konto3.getName());
        output(String.valueOf(konto3.getKontoStand()));
        output(String.valueOf(konto3.getNeuKontoStand()));

        output("Dritter Konto ist :" + konto3.getName() + ". Der Kontostand war: "
        + konto3.getKontoStand() + ". Der neuer Kontostand ist " + konto3.getNeuKontoStand() + ".");



    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

   



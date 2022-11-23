package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // int kontoStand = 10000;

        Konto konto1 = new Konto("Konto2");
        output(konto1.getName());

        // output(String.valueOf(konto1.getKontoStand()));
        // konto1.setKontoStand(10000);
        
        // output(konto1.getKontoStand());
        // System.out.println("Kontostand ist: " );

        // Konto konto2 = new Konto(10000);

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

   



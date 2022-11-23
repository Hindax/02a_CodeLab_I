package com.cc.java;



public class Konto {

    private String name;
    private int kontoStand;
    private int neuKontoStand;

    public Konto(String name, int kontoStand, int neuKontoStand) {
        this.name = name;
        this.kontoStand = kontoStand;
        this.neuKontoStand = neuKontoStand;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getKontoStand() {
        return kontoStand;
    }


    public int getNeuKontoStand() {
        return neuKontoStand;
    }


    public void setKontoStand(int kontoStand) {
        this.kontoStand = kontoStand;
    }


    public void setNeuKontoStand(int neuKontoStand) {
        this.neuKontoStand = neuKontoStand;
    }

    
    


}
    




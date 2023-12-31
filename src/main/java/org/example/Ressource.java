package org.example;

public class Ressource {
    private int benefit;    //benfit for the animal after eating ressource
    private int quant;  //quantity of a ressource in the ecosystem
    private String name;
    private int proba;  //probability of happening

    public Ressource(int benefit, int quant, String name, int proba) {
        this.benefit = benefit;
        this.quant = quant;
        this.name = name;
        this.proba = proba;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }
}

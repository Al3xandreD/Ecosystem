package org.example;

public class Ressource extends Element{
    private int benefit;    //benfit for the animal after eating ressource
    private int quant;  //quantity of a ressource in the ecosystem
    private String name;
    private int proba;  //probability of happening

    public Ressource(float pos_x, float pos_y, int benefit, int quant, String name, int proba) {
        super(pos_x, pos_y);
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

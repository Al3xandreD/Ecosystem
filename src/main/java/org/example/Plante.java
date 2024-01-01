package org.example;

public class Plante extends Element{
    private boolean isToxic;    // plant's toxicity
    private int size;   //plant's size

    public Plante(int pos_x, int pos_y, boolean isToxic, int size){
        super(pos_x,pos_y);
        this.isToxic=isToxic;
        this.size=size;
    }
}

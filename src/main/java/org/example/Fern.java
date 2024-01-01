package org.example;

public class Fern extends Plante{
    private String name;    // species anme
    private int calories;   // calories released if eaten;
    public Fern(int pos_x, int pos_y, boolean isToxic, int size, String name, int calories) {
        super(pos_x, pos_y, isToxic, size);
        this.name=name;
        this.calories=calories;
    }
}

package org.example;

public class Herbivor extends Animal{
    private int p_detect;   //probability to detect a predator

    public Herbivor(int speed, int v_field, int f_ration, String behavior, int life, int maxLife, int[] position, int p_detect) {
        super(speed, v_field, f_ration, behavior, life, maxLife, position);
        this.p_detect = p_detect;
    }
}

package org.example;

public class Predator extends Animal {
    private String strategy; // strategy to kill a prey
    private int flare_r;    //distance to which a prey can be flared

    public Predator(int speed, int v_field, int f_ration, String behavior, int life, int maxLife, int[] position, String strategy) {
        super(speed, v_field, f_ration, behavior, life, maxLife, position);
        this.strategy = strategy;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public int getFlare_r() {
        return flare_r;
    }

    public void setFlare_r(int flare_r) {
        this.flare_r = flare_r;
    }

    public boolean attack(){
        //returns true if attack was succesful
    }
}

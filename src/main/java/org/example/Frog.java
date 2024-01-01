package org.example;

public class Frog extends Animal{ ;
    static private int maxLife=50;
    private float orientation;
    public Frog(int life, float pos_x, float pos_y){
        super(life, pos_x, pos_y);
    }

    @Override
    public void move() {
        // changer l'orientation en fonction des fléches clavier
        // utiliser KeyListener
    }



}

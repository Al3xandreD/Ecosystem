package org.example;

import java.util.Random;

public class Fly extends Animal{
    static private int maxLife=3;

    public Fly(int life, float pos_x , float pos_y){
        super(life, pos_x, pos_y);
    }

    @Override
    public void move() {
        Random random=new Random();
        this.setPos_x(this.getPos_x()+ random.nextFloat());
        this.setPos_y(this.getPos_y()+ random.nextFloat());
        // ajouter une stratégie pour éviter la langue de la frog
    }


}

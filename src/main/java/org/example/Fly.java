package org.example;

import java.util.Random;

public class Fly extends Animal{
    static private int maxLife=3;
    private int f_speed;    // flying speed

    public Fly(float pos_x , float pos_y, int f_speed){
        super(maxLife, pos_x, pos_y);
        this.f_speed=f_speed;
    }

    public int getF_speed() {
        return f_speed;
    }

    public void setF_speed(int f_speed) {
        this.f_speed = f_speed;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "life=" + this.getLife() +
                "\nposition selon x=" + this.getPos_x() +
                "\nposition selon y=" + this.getPos_y() +
                "\nflying speed=" + this.getF_speed() +
                '}';
    }
    @Override
    public void move() {
        Random random=new Random();
        this.setPos_x(this.getPos_x()+ random.nextFloat()*5);
        this.setPos_y(this.getPos_y()+ random.nextFloat()*5);
        // ajouter une stratégie pour éviter la langue de la frog
    }


}

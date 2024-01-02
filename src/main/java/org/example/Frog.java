package org.example;

public class Frog extends Animal{
    private static int maxLife = 50;
    ;
    private double orientation;
    public Frog(float pos_x, float pos_y, double orientation){
        super(maxLife,pos_x, pos_y);
        this.orientation=orientation;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "life=" + this.getLife() +
                "\nposition selon x=" + this.getPos_x() +
                "\nposition selon y=" + this.getPos_y() +
                "\norientation=" + this.getOrientation() +
                '}';
    }
    @Override
    public void move() {
        // changer l'orientation en fonction des fléches clavier
        // utiliser KeyListener
    }



}

package org.example;

abstract public class Animal extends Element {
    private int life;
    private int maxLife;

    public Animal(int maxLife,float pos_x, float pos_y) {
        super(pos_x, pos_y);
        this.setMaxLife(maxLife);
        this.life = this.getMaxLife();  // maximum life at birth
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return this.maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    abstract public void move();

    @Override
    public String toString() {  // used for printing the state of an animal
        return "Animal{" +
                "life=" + life +
                '}';
    }
}
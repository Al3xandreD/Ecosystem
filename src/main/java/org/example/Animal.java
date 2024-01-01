package org.example;

abstract public class Animal extends Element{
    private int life;
    static private int maxLife;    //maximum life for the animal

    public Animal(int life, float pos_x, float pos_y) {
        super(pos_x, pos_y);
        this.life=this.getMaxLife();
    }
    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life=life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }
    public void eat(Ressource food){
        this.life+=food.getBenefit();
    }

    abstract public void move();

}

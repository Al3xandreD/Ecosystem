package org.example;

<<<<<<< HEAD
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
=======
public class Animal {
    private int speed;
    private int v_field;    //vision field
    private int f_ration;   //food ration
    private String behavior;
    private int life;   //life of the animal
    private int maxLife;    //maximum life for the animal
    private int [] position;

    public Animal(int speed, int v_field, int f_ration, String behavior, int life, int maxLife, int[] position) {
        this.speed = speed;
        this.v_field = v_field;
        this.f_ration = f_ration;
        this.behavior = behavior;
        this.life = life;
        this.maxLife = maxLife;
        this.position = position;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getV_field() {
        return v_field;
    }

    public void setV_field(int v_field) {
        this.v_field = v_field;
    }

    public int getF_ration() {
        return f_ration;
    }

    public void setF_ration(int f_ration) {
        this.f_ration = f_ration;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
>>>>>>> origin/main
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }
<<<<<<< HEAD
=======



    public void birth(){
        this.life=this.maxLife;
    }

    public void die(){
        this.life=0;
    }
>>>>>>> origin/main
    public void eat(Ressource food){
        this.life+=food.getBenefit();
    }

<<<<<<< HEAD
    abstract public void move();
=======


>>>>>>> origin/main

}

package org.example;

public class Ecosys {
    private Ressource[] tabRes; // ressouces contained in the environement
    private Animal[] tabAni;    //animals contained in the ecosystem
    private int nb_frog;    //number of frogs
    private int nb_fly; // number of flies
    private int length;
    private int height;
    private int area;

    public Ecosys(int length, int height) {
        this.length=length;
        this.height=height;
        this.area=this.height*this.length;
    }

    public void init(){
        int k;
        for(k=0;k<=this.nb_frog;k++){
            this.tabAni.add
        }
        for(k=0;k<=this.nb_fly;k++){
            this.tabAni.add
        }
    }




    public Ressource[] getTabRes() {

        return tabRes;
    }

    public void setTabRes(Ressource[] tabRes) {

        this.tabRes = tabRes;
    }

    public Animal[] getTabAni() {

        return tabAni;
    }

    public void setTabAni(Animal[] tabAni) {

        this.tabAni = tabAni;
    }

    public int getNb_frog() {
        return nb_frog;
    }

    public void setNb_frog(int nb_frog) {
        this.nb_frog = nb_frog;
    }

    public int getNb_fly() {
        return nb_fly;
    }

    public void setNb_fly(int nb_fly) {
        this.nb_fly = nb_fly;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

package org.example;

public class Ecosys {
    private Ressource[] tabRes; // ressouces contained in the environement
    private Animal[] tabAni;    //animals contained in the ecosystem
    private int length;
    private int height;
    private int area;
    private int nb_pos; // number of positions that can be occupied

    public Ecosys(Ressource[] tabRes, Animal[] tabAni, int length, int height) {
        this.tabRes = tabRes;
        this.tabAni = tabAni;
        this.length=length;
        this.height=height;
        this.area=this.height*this.length;
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
}

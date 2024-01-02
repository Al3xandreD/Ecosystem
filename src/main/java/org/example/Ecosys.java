package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ecosys {
    //attributs regarding animals
    private int nb_frog;  //number of frogs
    private int nb_fly; // number of flies

    private int nb_res; // number of ressources
    private ArrayList<ArrayList<Ressource>> tabRes = new ArrayList<ArrayList<Ressource>>(nb_res); // ressouces contained in the environement
    private ArrayList<ArrayList<Animal>> tabAni = new ArrayList<ArrayList<Animal>>();    //animals contained in the ecosystem
    private int length;
    private int height;


    public Ecosys(int length, int height, int nb_frog, int nb_fly, int nb_res) {
        this.length=length;
        this.height=height;
        this.nb_frog=nb_frog;
        this.nb_fly=nb_fly;
        this.nb_res=nb_res;

        // init arrays
        ArrayList<Animal> fly_array=new ArrayList<Animal>();
        ArrayList<Animal> frog_array=new ArrayList<Animal>();
        Random random=new Random();
        int k;

        for(k=0;k<this.nb_fly;k++){ //creating flies
            float pos_x=random.nextFloat()*this.length;
            float pos_y= random.nextFloat()*this.height;
            int f_speed=random.nextInt(10);
            fly_array.add(new Fly(pos_x,pos_y,f_speed));
        }
        this.tabAni.add(fly_array);

        for(k=0;k<this.nb_frog;k++){ //creating frogs
            float pos_x=random.nextFloat()*this.length;
            float pos_y= random.nextFloat()*this.height;
            double orientation=random.nextFloat()*Math.PI;
            frog_array.add(new Frog(pos_x,pos_y,orientation));
        }
        this.tabAni.add(frog_array);
    }

    @Override
    public String toString() {
        return "Ecosys{" +
                "nb_frog=" + nb_frog +
                ", nb_fly=" + nb_fly +
                ", nb_res=" + nb_res +
                ", tabRes=" + tabRes +
                ", tabAni=" + tabAni +
                ", length=" + length +
                ", height=" + height +
                '}';
    }

    public int getNb_res() {
        return nb_res;
    }

    public void setNb_res(int nb_res) {
        this.nb_res = nb_res;
    }

    public ArrayList<ArrayList<Ressource>> getTabRes() {
        return tabRes;
    }

    public void setTabRes(ArrayList<ArrayList<Ressource>> tabRes) {
        this.tabRes = tabRes;
    }

    public ArrayList<ArrayList<Animal>> getTabAni() {
        return tabAni;
    }

    public void setTabAni(ArrayList<ArrayList<Animal>> tabAni) {
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

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Intrudor extends Element implements Eater{
    private static float pos_x = 50;    //TODO mettre les coordonnées pour qu'il s'affiche au centre du jeu
    private static float pos_y = 50;
    private boolean is_present;

    static private int iter_name=0;
    static private int iter_month=0;
    private String name;
    static final private ArrayList<String> arrayNames=new ArrayList<>();
    static {
        arrayNames.add("Optimus Prime");
        arrayNames.add("Terminator");
        arrayNames.add("Forest Gump");
        arrayNames.add("Luke Skywalker");
        arrayNames.add("Indiana Jones");
        arrayNames.add("Marty McFly");
        arrayNames.add("Tony Stark");
        arrayNames.add("Rocky Balboa");
        arrayNames.add("Le transporteur");
        arrayNames.add("Maverick");
        arrayNames.add("Harry Potter");
        arrayNames.add("John McClane");}
    private String huntPeriod;
    static final private ArrayList<String> arrayMonths=new ArrayList<>();
    static{
        arrayMonths.add("JANUARY");
        arrayMonths.add("FEBRUARY");
        arrayMonths.add("MARCH");
        arrayMonths.add("APRIL");
        arrayMonths.add("MAY");
        arrayMonths.add("JUNE");
        arrayMonths.add("JULY");
        arrayMonths.add("AUGUST");
        arrayMonths.add("SEPTEMBER");
        arrayMonths.add("OCTOBER");
        arrayMonths.add("NOVEMBER");
        arrayMonths.add("DECEMBER");
    }

    public Intrudor() {
        super(pos_x, pos_y);
        this.is_present=false;

        //setting name
        this.name=arrayNames.get(iter_name);
        iter_name+=1;

        //setting hunt month
        this.huntPeriod=arrayMonths.get(iter_month);
        iter_month+=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHuntPeriod() {
        return huntPeriod;
    }

    @Override
    public void eat(Animal animal) {
        animal.setLife(0);
    }
}

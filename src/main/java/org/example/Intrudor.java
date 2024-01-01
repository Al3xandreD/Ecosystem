package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Intrudor extends Element{
    private String name;
    private String huntPeriod;

    public Intrudor(int pos_x, int pos_y, String name) {
        super(pos_x, pos_y);
        this.name = name;
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

    private void setHunt(){
        Random random =new Random();
        List months=new ArrayList<>(); // array of months
        months.add("JANUARY");
        months.add("FEBRUARY");
        months.add("MARCH");
        months.add("APRIL");
        months.add("MAY");
        months.add("JUNE");
        months.add("JULY");
        months.add("AUGUST");
        months.add("SEPTEMBER");
        months.add("OCTOBER");
        months.add("NOVEMBER");
        months.add("DECEMBER");

        int hunt_month=random.nextInt(12);
        this.huntPeriod=(String) months.get(hunt_month);

    }
}

package org.example;

public class Player {
    private String name;
    private static int nb_id;   //unique number for identifying each player
    private int nb_point;   //number of points


    public Player(String name, int nb_point) {
        this.name = name;
        this.nb_point = nb_point;
    }
}

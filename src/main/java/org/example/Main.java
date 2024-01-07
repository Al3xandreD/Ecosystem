package org.example;

import java.util.Timer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = "Jacques Chirac";
        Player my_player = new Player(name, 0);
        Ecosys ecosys = new Ecosys(50, 50, 3, 100, 20);


        String c = ecosys.toString();
        System.out.println(c);
        unTour();
    }


    public void unTour(Ecosys ecosys) {
        boolean frog_alive=false;
        Timer my_timer=new Timer();

        for (Frog frog : ecosys.getTabAni().get(1)){    // checks if at least one frog is alive
            if (frog.getLife()>0){
                frog_alive=true;
            }
        }
        while (frog_alive){    //joueur toujours en vie
            for (Frog frog : ecosys.getTabAni().get(1)){    // updates frog_alive
                if (frog.getLife()>0){
                    frog_alive=true;
                }
            }


            for(Fly fly : ecosys.getTabAni().get(0)){   // on bouge les fly
                fly.move();
            }
            for(Frog frog : ecosys.getTabAni().get(1)){ // on bouge les frog
            frog.move();//TODO fournir les commandes du joueur à move()
                //TODO utiliser des interruptions pour les commandes joueur
            }

            //TODO mettre l'intru en fonction de la saison, avant de changer de saison
            //TODO utiliser des interruptions pour la fin du timer

        }

    }
}
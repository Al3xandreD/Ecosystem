package org.example;

public class Score {
    private int score_log ;

    public Score(){
        this.score_log = 0;
    }

    private void win_point(Fly fly){
        this.score_log+=fly.getF_speed()/fly.getAge();
    }

    private void loose_score(){
        this.score_log-=10;
    }

}

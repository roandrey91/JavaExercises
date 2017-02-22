package com.Andrei;

/**
 * Created by Andrei on 21.01.2017.
 */
public class Player {
    public String name;
    public  int health;
    public  String weapon;

    public void loseHealth (int demange){
        this.health = this.health -demange;
        if(this.health <=0){
            System.out.println("Player knocked out");
        }

            }
    public int healtRemaining (){
        return this.health;
    }
}

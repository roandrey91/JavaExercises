package com.Andrei;

/**
 * Created by Andrei on 23.01.2017.
 */
public class EnhancedPlayer {
    private String name;
    private int hitpoint = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitpoint = health;
        }
        this.weapon = weapon;
    }

    public int getHealth() {
        return hitpoint;
    }

    public void loseHealth(int demange) {
        this.hitpoint = this.hitpoint - demange;
        if (this.hitpoint <= 0) {
            System.out.println("Player knocked out");
        }


    }
}

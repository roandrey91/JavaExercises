package com.Andrei;

/**
 * Created by Andrei on 20.01.2017.
 */
public class Car extends Vehicle {
    private String weels;
    private boolean isManual;

    public Car(String name, String weels, boolean isManual) {
        super(name);
        this.weels = weels;
        this.isManual = isManual;
    }

    public String getWeels() {
        return weels;
    }

    public boolean isManual() {
        return isManual;
    }
}

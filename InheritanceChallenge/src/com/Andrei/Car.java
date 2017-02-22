package com.Andrei;

/**
 * Created by Andrei on 20.01.2017.
 */
public class Car extends Vehicle {

    private int weels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int weels, int doors, int gears, boolean isManual ) {
        super(name, size);
        this.weels = weels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear (int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to "+this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity  " + speed + " direction "+ direction);
    }
}

package com.Andrei;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine (){
        return "Car -> startEngine() ";
    }

    public String accelerate (){
        return "Car -> accelerate()";
    }

    public String breack(){
        return "Car -> breack()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine() ";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate() ";
    }

    @Override
    public String breack() {
        return "Mitsubishi -> breack() ";
    }
}









public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

package com.Andrei;

/**
 * Created by Andrei on 20.01.2017.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSloat;
    private int cardSloat;
    private  String bios;

    public Motherboard(String model, String manufacturer, int ramSloat, int cardSloat, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSloat = ramSloat;
        this.cardSloat = cardSloat;
        this.bios = bios;
    }
     public void loadProgram( String programName){
         System.out.println("Program " +programName + "is now loading..." );

    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSloat() {
        return ramSloat;
    }

    public int getCardSloat() {
        return cardSloat;
    }

    public String getBios() {
        return bios;
    }
}

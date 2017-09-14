/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author tjones61
 */
public abstract class Civic extends Honda{
    private String color;
    private String transmission;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if(!(transmission.equals("manual"))||!(transmission.equals("automatic"))){
            throw new IllegalArgumentException("This is not a valid transmission");
        }
        this.transmission = transmission;
    }
}

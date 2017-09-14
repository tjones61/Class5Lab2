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
public class Setup {
    public static void main(String[] args) {
        Civic myCar = new Civic();
        myCar.setDoors(2);
        myCar.setCylinders(4);
        myCar.setWheelDrive("front");
        myCar.setColor("silver");
        myCar.setTransmission("automatic");

        System.out.println("Doors: " + myCar.getDoors() + 
                            "\nCylinders: " + myCar.getCylinders() + 
                            "\nWheel Drive: " + myCar.getWheelDrive() +
                            "\nColor: " + myCar.getColor() +
                            "\nTransmission: " + myCar.getTransmission());

    }
}

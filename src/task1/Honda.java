/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author tjones61
 */
public class Honda {
    private String wheelDrive;

    public String getWheelDrive() {
        return wheelDrive;
    }

    public void setWheelDrive(String wheelDrive) {
        if(!(wheelDrive.equals("four"))||!(wheelDrive.equals("front"))||!(wheelDrive.equals("rear"))){
            throw new IllegalArgumentException("This is not a valid wheel drive");
        }
        this.wheelDrive = wheelDrive;
    }
}

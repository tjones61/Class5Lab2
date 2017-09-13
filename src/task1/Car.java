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
public class Car {
    private int doors;
    private int cylinders;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors<2||doors>4||doors%2 !=0){
            throw new IllegalArgumentException("This is not a valid amount of doors");
        }
        this.doors = doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        if(cylinders<3||cylinders>16){
            throw new IllegalArgumentException("This is not a valid amount of cylinders");
        }
        this.cylinders = cylinders;
    }

    
}

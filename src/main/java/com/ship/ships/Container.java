/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ship.ships;

/**
 *
 * @author nikos
 */
public abstract class Container {
    protected double mikos;

    //Constructor
    public Container(double mikos) {
        this.mikos = mikos;
    }

    public double getMikos() {
        return mikos;
    }

    public void setMikos(double mikos) {
        this.mikos = mikos;
    }

    public abstract double calcVolume();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ship.ships;

/**
 *
 * @author nikos
 */
public class TubeContainer extends Container {
    private double r;

    public TubeContainer(double mikos, double r) {
        super(mikos);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calcVolume() {
        return 3.14*r*r*mikos;
    }
}


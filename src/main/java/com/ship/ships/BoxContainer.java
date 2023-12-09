/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ship.ships;

/**
 *
 * @author nikos
 */
public class BoxContainer extends Container{
    private double h;
    private double platos;

    public BoxContainer(double mikos, double h, double platos) {
        super(mikos);
        this.h = h;
        this.platos = platos;
    }

    public double getH() {
        return h;
    }

    public double getPlatos() {
        return platos;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setPlatos(double platos) {
        this.platos = platos;
    }

    @Override
    public double calcVolume() {
        return h*platos*mikos;
    }
}


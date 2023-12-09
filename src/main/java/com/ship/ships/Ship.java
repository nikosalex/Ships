/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ship.ships;

/**
 *
 * @author nikos
 */
public class Ship {
    private String name;
    private Container[] containers;

    public Ship(String name) {
        this.name = name;
        containers = new Container[70];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContainer(Container c) {
        int boxCount  = 0;
        int tubeCount = 0;
        for (int i = 0; i < containers.length; i++) {
            if (containers[i] != null) {
                if (containers[i] instanceof BoxContainer) {
                    boxCount++;
                }
                else {
                    tubeCount++;
                }
            }
        }
        if (c instanceof BoxContainer) {
            if (boxCount == 50) {
                System.out.println("Δεν μπορεί να προστεθεί άλλο BoxContainer!");
                return;
            }
        }
        if (c instanceof TubeContainer) {
            if (tubeCount == 20) {
                System.out.println("Δεν μπορεί να προστεθεί άλλο TubeContainer!");
                return;
            }
        }
        for (int i = 0; i < containers.length; i++) {
            if (containers[i] == null) {
                containers[i] = c;
                break;
            }
        }
    }

    public double totalVolume() {
        double sum;

        sum = 0;
        for (int i = 0; i < containers.length; i++) {
            if (containers[i] != null) {
                sum += containers[i].calcVolume();
            }
        }
        return sum;
    }
}


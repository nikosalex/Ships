/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ship.ships;

/**
 *
 * @author nikos
 */
public class Ships {
    //compare volume for ships
    public static boolean compareVolume(Ship s1, Ship s2) {
        if (s1.totalVolume() < s2.totalVolume()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        //Create ships
        Ship s1 = new Ship("Cargo-1");
        Ship s2 = new Ship("Cargo-2");
        Ship s3 = new Ship("Cargo-3");
        Ship s4 = new Ship("Cargo-4");

        //Create box containers
        BoxContainer b1 = new BoxContainer(3,2,2);
        BoxContainer b2 = new BoxContainer(2,1.5,2);
        BoxContainer b3 = new BoxContainer(1.5,3,1.5);
        BoxContainer b4 = new BoxContainer(2,2,2);
        BoxContainer b5 = new BoxContainer(1,0.5,2);

        //Create tube containers
        TubeContainer t1 = new TubeContainer(3,2);
        TubeContainer t2 = new TubeContainer(1,3);
        TubeContainer t3 = new TubeContainer(2,2.5);
        TubeContainer t4 = new TubeContainer(1.5,0.5);
        TubeContainer t5 = new TubeContainer(3,1.5);

        //Load ship s1
        s1.addContainer(b1);
        s1.addContainer(t1);
        s1.addContainer(t3);

        //Load ship s2
        s2.addContainer(b2);
        s2.addContainer(t2);

        //Load ship s3
        s3.addContainer(b3);
        s3.addContainer(b5);
        s3.addContainer(t4);

        //Load ship s4
        s4.addContainer(b4);
        s4.addContainer(t5);

        //Create ships array to load ships
        Ship[] ships = new Ship[4];
        ships[0] = s1;
        ships[1] = s2;
        ships[2] = s3;
        ships[3] = s4;

        /*System.out.println("Συνολική χωρητικότητα πλοίου Cargo-1: "+ s1.totalVolume());
        System.out.println("Συνολική χωρητικότητα πλοίου Cargo-2: "+ s2.totalVolume());
        System.out.println("Συνολική χωρητικότητα πλοίου Cargo-3: "+ s3.totalVolume());
        System.out.println("Συνολική χωρητικότητα πλοίου Cargo-4: "+ s4.totalVolume());*/


        //Create bubble short algorithm
        int n = ships.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (compareVolume(ships[j],ships[j+1])) {
                    Ship temp = ships[j];
                    ships[j] = ships[j+1];
                    ships[j+1] = temp;
                }
            }
        }

        //Print ships array
        for (int i = 0; i < ships.length; i++) {
            System.out.println("Πλοίο: "+ships[i].getName()+", χωρητικότητα: "+ships[i].totalVolume());
        }
    }
}

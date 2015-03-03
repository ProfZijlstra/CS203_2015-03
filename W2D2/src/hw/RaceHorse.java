/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw;

/**
 *
 * @author mzijlstra
 */
public class RaceHorse {
    private String name;
    private double distance;
    
    public void run() {
        distance += Math.random() * 3 + 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    
}

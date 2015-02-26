/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package params;

/**
 *
 * @author mzijlstra
 */
public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public boolean isRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean rockStarUsesIt) {
        this.rockStarUsesIt = rockStarUsesIt;
    }
    
    
}

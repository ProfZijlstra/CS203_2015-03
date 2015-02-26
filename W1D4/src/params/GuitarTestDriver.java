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
public class GuitarTestDriver {
    public static void main(String[] args) {
        ElectricGuitar g1 = new ElectricGuitar();
        g1.setBrand("Gibson");
        g1.setNumOfPickups(6);
        g1.setRockStarUsesIt(false);
        
        ElectricGuitar g2 = new ElectricGuitar();
        g2.setBrand("Gibson");
        g2.setNumOfPickups(6);
        g2.setRockStarUsesIt(true);
        
    }
}

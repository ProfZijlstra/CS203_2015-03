/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hwreview;

/**
 *
 * @author mzijlstra
 */
public class StaticCarDriver {
    public static void main(String[] args) {
        StaticCar c = new StaticCar(3, 4);
        
        StaticCar.moveUp(c);
        System.out.println(StaticCar.getY(c));
    }
}

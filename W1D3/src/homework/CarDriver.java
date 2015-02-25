/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework;

/**
 *
 * @author mzijlstra
 */
public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        
        c1.moveUp();
        c1.moveUp();
        c1.moveRight();
        
        c2.moveDown();
        c2.moveLeft();
        c2.moveLeft();
        
        c1.printLocation();
        c2.printLocation();
        
    }
}

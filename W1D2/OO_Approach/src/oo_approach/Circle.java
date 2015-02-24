/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oo_approach;

/**
 *
 * @author mzijlstra
 */
public class Circle extends Shape {
    
    // overwrite rotate code written in the abstract super class
    public void rotate() {
        setX(getX() + 2);
    }
    
    public void playSound() {
        // circle specific sound code
    }
    
}

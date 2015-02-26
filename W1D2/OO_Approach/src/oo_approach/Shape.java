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
public abstract class Shape {
    protected int x;
    protected int y;
    
    public void rotate() {
        // Cirlce, Square and Triangle all rotate in this way
        // and will use this code
    }
    public abstract void playSound();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            x = 0;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
}

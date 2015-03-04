/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

/**
 *
 * @author mzijlstra
 */
public class Circle extends Shape implements Movable, java.io.Serializable {
    private int radius;
    
    public Circle(int r) {
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public int moveUp(int amount) {
        int ynow = getY();
        setY(getY() + amount);
        int yupd = getY();
        return ynow - yupd;
    }

    @Override
    public int moveDown(int amount) {
        int ynow = getY();
        setY(getY() - amount);
        int yupd = getY();
        return ynow - yupd;        
    }

    @Override
    public int moveLeft(int amount) {
        int xnow = this.x;
        this.x -= amount;
        return this.x - xnow;
    }

    @Override
    public int moveRight(int amount) {
        int xnow = this.x;
        this.x += amount;
        return this.x - xnow;        
    }
    
}

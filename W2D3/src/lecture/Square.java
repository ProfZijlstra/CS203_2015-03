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
public class Square extends Shape implements Movable, java.io.Serializable {
    // inherits X and Y from shape
    private int side;

    public Square(int side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
//    public String toString() {
//        return "I'm a square with sides: " + side;
//    }

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
    
    public String toString() {
        String s = super.toString();
        s += " Specifically a Square, with sides: " + side;
        return s;
    }
}

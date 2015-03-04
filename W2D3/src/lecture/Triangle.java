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
public class Triangle extends Shape {
    int baseWidth;
    int height;
    
    public Triangle(int baseWidth, int height) {
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double area() {
        return (baseWidth * height) / 2.0;
    }

    public int getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(int baseWidth) {
        this.baseWidth = baseWidth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    @Override
    public String toString() {
        String s= super.toString();
        s += " Specifically a Triangle with height: " + height + " baseWidth " 
                + baseWidth;
        return s;
    }
    
}

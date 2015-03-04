/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.util.ArrayList;
/**
 *
 * @author mzijlstra
 */
public class ShapeDriver {
    public static void main(String[] args) {
        //Shape s = new Shape(); // cannot do this, is abstract

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(4, 5));
        shapes.add(new Square(8));
        
        for (Shape s : shapes) {
            System.out.println(s.area()); // polymorphism
            System.out.println(s.toString()); // polymorphism
        }
        
        
        ArrayList<Movable> movables = new ArrayList<>();
        movables.add(new Square(4));
        movables.add(new Circle(3));
        for (Movable m : movables) {
            m.moveUp(5);
            System.out.println(m.getY());
        }
        
    }
    
}

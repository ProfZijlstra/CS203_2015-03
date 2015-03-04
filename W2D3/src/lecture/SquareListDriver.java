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
public class SquareListDriver {

    public static void main(String[] args) {
        // when we use the generic class, we provide which Type it should 
        // use internally
        MyList<Shape> sl = new MyList<>();
        sl.add(new Square(5));
        sl.add(new Triangle(3, 1));
        //sl.add("Hahah, I can add anything");

        for (int i = 0; i < sl.getSize(); i++) {
            Shape out = sl.get(i);
            
            if (out instanceof Shape) {
            // this is down-casting, considere bad in general
                // if you do it, be sure to check type with instanceof
                Shape s = (Shape) out; // real dangerous, we don't like it
                System.out.println(s); // =(
                System.out.println(s.hashCode()); // =(
            } else {
                // don't do it, casting will lead to runtime errors
            }
        }
        
        MyList<String> strings = new MyList<>();
        strings.add("yeah! it's working");
        
    }
}

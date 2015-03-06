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
public class MyMathDriver {
    public static void main(String[] args) {
        MyMath m1 = new MyMath("Michael");
        MyMath m2 = new MyMath("Albert");
        
        System.out.println(MyMath.min(5, 4));
    }
}

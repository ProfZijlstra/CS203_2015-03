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
public class TestDriverDefaults {
    public static void main(String[] args) {
        Defaults d = new Defaults();
        System.out.println(d.getNum());
        System.out.println(d.getFloaty());
        System.out.println(d.isThruthy());
        System.out.println(d.getTest());
        
        int i;
        // lot of other things
        i = 5;
        System.out.println(i);
    }
}

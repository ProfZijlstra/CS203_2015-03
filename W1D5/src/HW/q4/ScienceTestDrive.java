/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HW.q4;

/**
 *
 * @author mzijlstra
 */
public class ScienceTestDrive {
    public static void main(String[] args) {
        int i = 5;
        GuineaPig g = new GuineaPig();
        g.setName("fred");
        
        System.out.println("Before the change");
        System.out.println("My integer is: " + i);
        System.out.println("My guinea pig is: " + g.getName());
        
        Scientist s = new Scientist();
        s.changeThese(i, g);
        
        System.out.println("After the change");
        System.out.println("My integer is: " + i);
        System.out.println("My guinea pig is: " + g.getName());
        
    }
}

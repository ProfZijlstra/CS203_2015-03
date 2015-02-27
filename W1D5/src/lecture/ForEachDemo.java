/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import HW.q4.GuineaPig;

/**
 *
 * @author mzijlstra
 */
public class ForEachDemo {
    public static void main(String[] args) {
        GuineaPig[] pigs = new GuineaPig[5];
        pigs[0] = new GuineaPig();
        pigs[0].setName("gp0");
        pigs[1] = new GuineaPig();
        pigs[1].setName("gp1");
        pigs[2] = new GuineaPig();
        pigs[2].setName("gp2");
        pigs[3] = new GuineaPig();
        pigs[3].setName("gp3");
        pigs[4] = new GuineaPig();
        pigs[4].setName("gp4");
        
        for (GuineaPig myMan : pigs) {
            System.out.println(myMan.getName());
        }
        
        for (double d = 0.0; d < 10; d++) {
            System.out.println(d);
        }
    }
    
}

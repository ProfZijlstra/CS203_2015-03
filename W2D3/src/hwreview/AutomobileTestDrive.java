/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hwreview;

import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class AutomobileTestDrive {
    public static void main(String[] args) {
        ArrayList<Automobile> autos = new ArrayList<>();
        
        autos.add(new Car());
        autos.add(new Truck());
        
        for (Automobile a : autos) {
            a.accelerate(); // run time polymorphism
            a.accelerate();
            a.accelerate();
            a.brake();
            System.out.println(a.speed); // cause I'm in the same package
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hwreview;

/**
 *
 * @author mzijlstra
 */
public class GargeTestDriver {
    public static void main(String[] args) {
        Car c = new Car();
        c.setMake("Honda");
        
        Garage g = new Garage();
        g.store(c); // using an overloaded method (compile time poly)
        
        System.out.println(g.retrieve().getMake()); // also compile time poly
        
        Truck t = new Truck();
        t.setMake("Ford");
        
        g.store(t);
        System.out.println(g.retrieve().getMake());
        
        Item i1 = new Item();
        i1.setName("Toolbox");
        Item i2 = new Item();
        i2.setName("Bicycle");
        
        g.store(i1);
        g.store(i2);
        
     
        
        for (int i = 0; i < g.getItemCount(); i++) {
            System.out.println(g.retrieve(i).getName());
        }
    }
}

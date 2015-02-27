/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package defaults;

/**
 *
 * @author mzijlstra
 */
public class CatTestDriver {
    public static void main(String[] args) {
        Cat schrodinger = new Cat();
        
        schrodinger.setName("Schrodinger");
        
        System.out.println(schrodinger.getAge());
        System.out.println(schrodinger.getName());
        System.out.println(schrodinger.getGender());
        
    }
    
}

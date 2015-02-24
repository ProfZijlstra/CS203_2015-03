/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oo_reveal;

/**
 *
 * @author mzijlstra
 */
public class OO_reveal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Make a person object of the Person class
        Person p1 = new Person();
        // set the name on the p1 object
        p1.setFirstname("Michael");
        
        // make a Dog object
        Dog d1 = new Dog();        
        // set the name on the d1 object
        d1.setName("Fido 2");
        // set the age on the d1 object
        d1.setAge(5);
        // print the name of the d1 object
        System.out.println(d1.getName());
        
        // connect the d1 object to the p1 person
        p1.setMydog(d1);
        System.out.println(p1.getMydog().getName());
        
        Dog d2 = new Dog();
        //d2.name = "Rudy";  // is considered bad style, very very bad
        //d2.name = "Rudy 2";
        //d2.setName("Rudy 2");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw_review;

/**
 *
 * @author mzijlstra
 */
public class PersonTestDrive {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstname = "John";
        p1.lastname = "Doe";
        
        Person[] ppl = new Person[5];
        for (int i = 0; i < ppl.length; i++) {
            ppl[i] = p1;
        }
        
        p1.lastname = "Smith";
        for (int i = 0; i < ppl.length; i++) {
            System.out.println(ppl[i].firstname + " " + ppl[i].lastname);
        }
    }
}

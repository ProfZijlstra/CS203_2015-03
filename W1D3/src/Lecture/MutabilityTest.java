/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lecture;

/**
 *
 * @author mzijlstra
 */
public class MutabilityTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Fido";
        Dog d2 = new Dog();
        d2.name = "Rufus";
        Dog d3 = d1;
        d3.name = "Sam";
        
        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d3.name);
    }
}

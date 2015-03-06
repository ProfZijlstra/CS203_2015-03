/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package review;

/**
 *
 * @author mzijlstra
 */
public class PersonDriver {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(5);
        p.setName("Pete");
        
        System.out.println(p.getAge());
        String name = p.getName();
        
        System.out.println("Everything is done");
    } 
}

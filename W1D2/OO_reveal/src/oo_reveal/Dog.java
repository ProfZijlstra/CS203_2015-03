package oo_reveal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mzijlstra
 */
public class Dog {
    // instance variable
    private String name;
    private int age;
    
    public void setName(String name) {
        System.out.println(this.name);
        this.name = name;
        System.out.println(this.name);
    }
    
    public void setAge(int a) {
        age = a;
    } 
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
}

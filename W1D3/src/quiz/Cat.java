/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author mzijlstra
 */
public class Cat {
    String name;
    String gender;
    int age;
    
    public void purr() {
        System.out.println(this.name + " is purring");
    }
    
    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

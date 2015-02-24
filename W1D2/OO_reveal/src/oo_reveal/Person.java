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
public class Person {
    private String firstname;
    private String lastname;
    private int birth_year;
    private Dog mydog;

    public Dog getMydog() {
        return mydog;
    }

    public void setMydog(Dog mydog) {
        this.mydog = mydog;
    }
    
    
    
    
    public int calculateAge() {
        return birth_year - 2015;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }
    
    
    
}

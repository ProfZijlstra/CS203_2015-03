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
public class HamsterTestDrive {
    public static void main(String[] args) {
        Hamster[] hamsters = new Hamster[100];
        for (int i = 0; i < hamsters.length; i++) {
            hamsters[i] = new Hamster();
            hamsters[i].age = Math.random() * 3;
        }
        
        double ageSum = 0;
        
        for (int i = 0; i < hamsters.length; i++) {
            ageSum += hamsters[i].age;
        }
        double average = ageSum / hamsters.length;
        System.out.println("Average hamster age: " + average);
    }
}

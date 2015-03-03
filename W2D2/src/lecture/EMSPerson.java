/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

/**
 *
 * @author mzijlstra
 */
public class EMSPerson {
    
    public void helpPerson() {
        System.out.println("I'm helpoing");
        Doctor d = new Doctor();
        System.out.println("My doctor works at a hospital: " + d.worksAtHospital);
        
    }
}

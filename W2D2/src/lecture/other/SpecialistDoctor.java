/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture.other;

//import lecture.Doctor;

/**
 *
 * @author mzijlstra
 */
public class SpecialistDoctor extends lecture.Doctor {
    
    @Override
    public void treatPatient() {
       System.out.println("Do my special things"); 
       //System.out.println("Works at hospital: " + this.worksAtHospital);
    }

}

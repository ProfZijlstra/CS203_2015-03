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
public class Doctor {
    boolean worksAtHospital;

    public boolean isWorksAtHospital() {
        return worksAtHospital;
    }

    public void setWorksAtHospital(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }
    
    
    
    public void treatPatient() {
        System.out.println("Gives some pills");
    }
}

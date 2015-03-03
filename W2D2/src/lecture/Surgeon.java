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
public class Surgeon extends Doctor {
    
    
    @Override
    public void treatPatient() {
       System.out.println("Cut them open a bit"); 
       System.out.println("Works at hospital: " + this.worksAtHospital);
    }
    
    public void makeIncision() {
        
    }
}

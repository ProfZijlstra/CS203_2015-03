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
public class DocterTestDrive {
    public static void main(String[] args) {
        Surgeon s = new Surgeon();
        s.treatPatient();
        
        FamilyDoctor fd = new FamilyDoctor();
        fd.treatPatient();
        
        Doctor d = new Doctor();
        d.treatPatient();
    }
}

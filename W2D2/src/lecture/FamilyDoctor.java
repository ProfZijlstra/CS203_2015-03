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
public class FamilyDoctor extends Doctor {
    private boolean makesHouseCalls;

    public boolean isMakesHouseCalls() {
        return makesHouseCalls;
    }

    public void setMakesHouseCalls(boolean makesHouseCalls) {
        this.makesHouseCalls = makesHouseCalls;
    }
    
    
    
    public void givesAvice() {
        // gives advice to patient
    }
}

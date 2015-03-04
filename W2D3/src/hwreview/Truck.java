/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hwreview;

/**
 *
 * @author mzijlstra
 */
public class Truck extends Automobile {
    private boolean hasTailGate;
    private int caryingCapacity;

    @Override
    public void accelerate() {
        speed += 7;
    }
    
    public boolean isHasTailGate() {
        return hasTailGate;
    }

    public void setHasTailGate(boolean hasTailGate) {
        this.hasTailGate = hasTailGate;
    }

    public int getCaryingCapacity() {
        return caryingCapacity;
    }

    public void setCaryingCapacity(int caryingCapacity) {
        this.caryingCapacity = caryingCapacity;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.util.Objects;

/**
 *
 * @author mzijlstra
 */
public class Defaults {
    private int num;
    private boolean thruthy;
    private double floaty;
    private String test;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isThruthy() {
        return thruthy;
    }

    public void setThruthy(boolean thruthy) {
        this.thruthy = thruthy;
    }

    public double getFloaty() {
        return floaty;
    }

    public void setFloaty(double floaty) {
        this.floaty = floaty;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.num;
        hash = 37 * hash + (this.thruthy ? 1 : 0);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.floaty) ^ (Double.doubleToLongBits(this.floaty) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.test);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Defaults other = (Defaults) obj;
        if (this.num != other.num) {
            return false;
        }
        if (this.thruthy != other.thruthy) {
            return false;
        }
        if (Double.doubleToLongBits(this.floaty) != Double.doubleToLongBits(other.floaty)) {
            return false;
        }
        if (!Objects.equals(this.test, other.test)) {
            return false;
        }
        return true;
    }
    
    
}

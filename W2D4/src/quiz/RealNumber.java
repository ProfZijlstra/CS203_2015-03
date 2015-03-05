/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author mzijlstra
 */
public class RealNumber extends AbstractNumber implements Addable, Multiplyable {

    @Override
    public double getNumber() {
        return number;
    }

    @Override
    public double add(int num) {
        number += num;
        return number;
    }

    @Override
    public double multiply(int num) {
        number *= num;
        return number;
    }
    
}

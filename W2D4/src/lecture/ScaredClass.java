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
public class ScaredClass {
    private String name;

    public ScaredClass(String name) {
        this.name = name;
    }
    
    @Override
    public void finalize() throws Throwable {
        System.out.println("Oh no! the Garbage collector is here! " + name);
        super.finalize();
    }
    
}

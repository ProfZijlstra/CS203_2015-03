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
public class TestGarbageCollector {
    public static void main(String[] args) throws InterruptedException {
        ScaredClass s1 = new ScaredClass("helpless");
        s1 = null;
        
        Thread.sleep(5000);
        
        System.out.println("end of the world");
    }
}

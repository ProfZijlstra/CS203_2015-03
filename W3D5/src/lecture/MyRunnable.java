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
public class MyRunnable implements Runnable {
    @Override
    public void run() { go(); }
    public void go() { 
        doMore(); 
    }
    public void doMore() { System.out.println("Top of the Stack"); }
}

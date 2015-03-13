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
public class TwoThreads  implements Runnable {
    public static void main(String[] args) {
        TwoThreads job = new TwoThreads();
        Thread alpha = new Thread(job);
        Thread beta = new Thread(job);
        alpha.setName("Alpha");
        beta.setName("Beta");
        alpha.start();
        beta.start();
    }
   
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name);
        }
    } 
}

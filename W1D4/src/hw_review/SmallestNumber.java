/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw_review;

/**
 *
 * @author mzijlstra
 */
public class SmallestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] nums = new double[100];
        for (int i = 0; i< nums.length; i++) {
            nums[i] = Math.random() * 100;
        }
        
        double smallest = nums[0];
        for (int i = 0; i< nums.length; i++) {
            //System.out.print(nums[i] + " ");
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        //System.out.println();
        System.out.println("smallest: " + smallest);
    }
    
}

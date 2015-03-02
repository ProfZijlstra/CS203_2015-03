/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d1.lecturestack;

/**
 *
 * @author mzijlstra
 */
public class Smallest {
    public static int smallest(int[] nums) {
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }        
        return smallest;
    }
    
    public static void main(String[] args) {
        int[] nums0 = {4, 8, 3, 5, 7, 2, 1, 9};
        int[] nums1 = {14, 18, 13, 15, 17, 12, 11, 19};
        int[] nums2 = {24, 28, 23, 25, 27, 22, 21, 29};
        
        int s1 = smallest(nums0);
        int s2 = smallest(nums1);
        int s3 = smallest(nums2);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}

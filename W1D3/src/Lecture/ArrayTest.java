package Lecture;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mzijlstra
 */
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //int[] nums = new int[5];
        int[] nums = {7, 3, 19, 44, 8}; // array litteral
        int[] nums2 = new int[nums.length * 2];
        
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        
        int[] nums3 = Arrays.copyOf(nums, nums.length * 2);
        
        String s = "Hello World";
        char c = s.charAt(0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d1.lecture.api;

import java.util.ArrayList;
//import w2d1.lecture.api.mypackage.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class ArraListTestDriver {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        
        String test = "Test";
        
        nums.add("Hello");
        nums.add("World");
        nums.add(test);
        
        System.out.println(nums.get(1));
        nums.remove(1);
        System.out.println(nums.get(1));
        System.out.println(nums.remove(test));
        System.out.println(nums.size());
        
        
        ArrayList<Integer> ints = new ArrayList<>();
        Integer five = new Integer(5);
        ints.add(five);
        ints.remove(five);
        
        w2d1.lecture.api.mypackage.ArrayList stuff = new w2d1.lecture.api.mypackage.ArrayList();
        stuff.data[0] = 5;
    }
}

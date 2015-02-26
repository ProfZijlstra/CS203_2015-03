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
public class ComparisonTestDriver {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "He";
        String s4 = "llo";
        String s5 = s3 + s4;
        
        System.out.println(s5);
        System.out.println(s5 == s1);
        System.out.println(s1 == s2);
        System.out.println(s5.equals(s1));
        
    }
}

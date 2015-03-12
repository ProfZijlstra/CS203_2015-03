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
public class SplitSomething {
    public static void main(String[] args) {
        String test = "Hello does this work";
        String[] out = test.split(" ");
        for (String s : out) {
            System.out.println(s);
        }
    }
}

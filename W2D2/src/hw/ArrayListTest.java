/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw;

import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        
        for (int i = 0; i < 200; i++) {
            ints.add((int)(Math.random() * 100));
        }
        System.out.println(ints.size());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examreview;

import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class Question15 {
    public static void main(String[] args) {
        ArrayList<Tree> trees = new ArrayList<>();
        trees.add(new Tree(5));
        trees.add(new Tree(10));
        trees.add(new Tree(12));
        trees.add(new Tree(4));
        trees.add(new Tree(8));
        
        System.out.println(findGreatestDifference(trees));
    }
    
    
    public static int findGreatestDifference(ArrayList<Tree> trees) {
        int biggest = Math.abs(trees.get(0).getHeight() - trees.get(1).getHeight());
        int position = 0;
        for (int i =1 ; i < trees.size() -1; i++) {
            int diff = Math.abs(trees.get(i).getHeight() - trees.get(i +1).getHeight());
            if (diff > biggest) {
                biggest = diff;
                position = i;
            }
        }
        return position;
        
    }
}

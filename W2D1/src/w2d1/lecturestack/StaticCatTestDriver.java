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
public class StaticCatTestDriver {
    public static void main(String[] args) {
        Cat normal = new Cat();
        normal.setName("Mormel");
        
        StaticCat cat1 = new StaticCat();
        StaticCat cat2 = new StaticCat();
        
        StaticCat.setName(cat1, "Mimi");
        StaticCat.setName(cat2, "Mittens");
        
        System.out.println(StaticCat.getName(cat1) + " says meow");
    }
    
}

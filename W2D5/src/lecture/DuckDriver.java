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
public class DuckDriver {
    public static void main(String[] args) {
        System.out.println(Duck.getCount());
        
        
        
        final Duck d1 = new Duck("Donald");
        d1.setAge(5);
        //d1 = new Duck("Daisy");
        Duck d2 = new Duck("Daffy");
        
        System.out.println(d1.howManyExist());
        System.out.println(d2.howManyExist());
    }
}

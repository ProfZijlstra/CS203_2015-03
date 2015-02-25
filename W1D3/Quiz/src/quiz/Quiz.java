/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author mzijlstra
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cat c1 = new Cat();
         c1.name = "Mimi";
         c1.setName("Mimi") ;
         Cat c2 = new Cat();
         c2.setName("Mittens");
         
         c1.purr();
         c2.purr();
         c1.sleep();
         c2.sleep();
         
         System.out.println("I made " + c1.getName() + " sleep");
    }
    
}

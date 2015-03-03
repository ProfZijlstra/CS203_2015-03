/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class PersonDriver {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        
        ArrayList<Person> ppl = new ArrayList<>();
        ppl.add(p);
        for (Person pe : ppl) {
            pe.sayHello();
        }
    }
}

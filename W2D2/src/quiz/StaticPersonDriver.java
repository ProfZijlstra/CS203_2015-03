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
public class StaticPersonDriver {
    public static void main(String[] args) {
        StaticPerson p1 = new StaticPerson();
        StaticPerson.setName(p1, "John");
        StaticPerson p2 = new StaticPerson();
        StaticPerson.setName(p2, "Jane");
        
        ArrayList<StaticPerson> ppl = new ArrayList<>();
        ppl.add(p1);
        ppl.add(p2);
        for (StaticPerson pe : ppl) {
            StaticPerson.sayHello(pe);
        }
    }
}

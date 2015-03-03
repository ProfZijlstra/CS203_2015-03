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
public class StaticPerson {

    private String name;

    public static String getName(StaticPerson This) {
        return This.name;
    }

    public static void setName(StaticPerson This, String name) {
        This.name = name;
    }

    public static void sayHello(StaticPerson This) {
        System.out.println(This.name + " says hello");
    }

}

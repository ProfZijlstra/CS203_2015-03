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
public class StaticCat {

    private String name;
    private int age;

    public static String getName(StaticCat This) {
        return This.name;
    }

    public static void setName(StaticCat This, String name) {
        This.name = name;
    }

    public static int getAge(StaticCat This) {
        return This.age;
    }

    public static void setAge(StaticCat This, int age) {
        This.age = age;
    }

}

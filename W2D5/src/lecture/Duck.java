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
public class Duck {
    private static int count = 0;
    private final String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    static {
        System.out.println("I'm executing when the class is loaded "
                + "for the first time, probably when program starts up");
        count = 5;        
    }
    

    public Duck(String name) {
        count += 1;
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
    
    public String howManyExist() {
        return name + " says there are " + Duck.count;
    }
    
    public static int getCount() {
        return count;
    }
    
}

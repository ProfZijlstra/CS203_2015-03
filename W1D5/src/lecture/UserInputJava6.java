/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.io.Console;

/**
 *
 * @author mzijlstra
 */
public class UserInputJava6 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("What is your name");
        String s = c.readLine();
        c.printf("Hello %s", s);
        
    }
    
}

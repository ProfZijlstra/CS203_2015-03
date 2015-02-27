/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.util.Scanner;

/**
 *
 * @author mzijlstra
 */
public class UserInputJava5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = s.nextLine();
        
        System.out.print("What is your age? ");
        int age = s.nextInt();
        int next = age + 1;
        
        System.out.println("Hello " + name + " next year you'll be " + next);
    }
}

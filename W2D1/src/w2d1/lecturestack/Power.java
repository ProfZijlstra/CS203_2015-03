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
public class Power {
    public static void main(String[] args) {        
        double awesome = power(2, 5);
        System.out.println(awesome);
    }
    
    public static double power(double base, int exp) {
        if (exp == 0) {
            return 1;
        }
        
        double result = base;
        for (int i = 1; i < exp; i++) {
            result  = multiply(result, base);
        }
        return result;
    }
    
    public static double multiply(double num1, double num2) {
        double result = num1;
        for (int i = 1; i < num2; i++) {
            result = add(result, num1);
        }
        return result;
    }
    
    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
}

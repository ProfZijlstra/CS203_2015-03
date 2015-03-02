/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d1.hwreview.infppl;

import java.util.Scanner;

/**
 *
 * @author Zbrodale
 */
public class Player {
    private String name;
    private int number = 0;             // where the guess goes
    
    public void guess() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " please enter your guess : ");
        number = sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
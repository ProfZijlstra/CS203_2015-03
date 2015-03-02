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
public class GuessGame {
    Player[] ppl;
    
    
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many ppl: ");
        int pplamount = sc.nextInt();
        
        ppl = new Player[pplamount];

        for (int i = 0; i < pplamount; i++) {
            ppl[i] = new Player();
            ppl[i].setName("Player " + i);
        }
        
        System.out.print("Number from 0 up to: ");
        int max = sc.nextInt();
        
        int targetNumber = (int) (Math.random() * max);
        System.out.println("I'm thinking of a number between 0 and " + max);

        while (true) {
            for (int i = 0; i < pplamount; i++) {
                ppl[i].guess();
            }
            
            String result = "";
            for (int i = 0; i < pplamount; i++) {
                if (ppl[i].getNumber() == targetNumber) {
                    result += ppl[i].getName() + " got it right";
                }
            }
            
            if (result.equals("")) {
                System.out.println("Players will have to try again.");
            } else {
                System.out.println(result);
                System.out.println("Game is over.");
                break;
            }            
        }
    }
}

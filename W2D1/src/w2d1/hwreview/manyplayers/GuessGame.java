/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1.hwreview.manyplayers;

import java.util.Scanner;

/**
 *
 * @author Zbrodale
 */
public class GuessGame {

    Player[] players;

    public void startGame() {
        // setup phase
        Scanner sc = new Scanner(System.in);
        System.out.print("How many players: ");
        int ppl = sc.nextInt();
        
        System.out.print("Guess range between 0 and: ");
        int max = sc.nextInt();

        players = new Player[ppl];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
            players[i].setName("Player " + i);
        }

        int targetNumber = (int) (Math.random() * max);
        System.out.println("I'm thinking of a number between 0 and " + max);

        while (true) {

            String result = null;
            for (Player p : players) {
                p.guess();
                if (p.isRight(targetNumber)) {
                    if (result == null) {
                        result = p.getName() + " got it right!\n";
                    } else {
                        result += p.getName() + " got it right!\n";
                    }
                }
            }
            
            if (result == null) {
                System.out.println("Players will have to try again.");
            } else {
                System.out.println(result);
                break;
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d1.hwreview;

/**
 *
 * @author Zbrodale
 */
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p1.setName("Player 1");
        p2 = new Player();
        p2.setName("Player 2");
        p3 = new Player();
        p3.setName("Player 3");

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();

            if (p1.getNumber() == targetNumber || 
                    p2.getNumber() == targetNumber || 
                    p3.getNumber() == targetNumber) {
                
                System.out.println("We have a winner!!!");
                System.out.println("Player one got it right? " 
                        + (p1.getNumber() == targetNumber));
                System.out.println("Player two got it right? " 
                        + (p2.getNumber() == targetNumber));
                System.out.println("Player three got it right? " 
                        + (p3.getNumber() == targetNumber));
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}

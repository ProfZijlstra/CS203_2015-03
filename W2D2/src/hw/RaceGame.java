/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

/**
 *
 * @author mzijlstra
 */
public class RaceGame {

    public static void main(String[] args) {
        String winner;
        boolean result = true;
        double z = 0.0;

        if (args.length < 2) {
            System.out.println("Need at least two names.");
            return; // NOT BREAK! Don't need an else.
        }

        RaceHorse[] horses = new RaceHorse[args.length];
        for (int i = 0; i < args.length; i++) {
            horses[i] = new RaceHorse();
            horses[i].setName(args[i]);
        }

        while (result) {
            for (RaceHorse horse : horses) {
                horse.run();
            }
            for (RaceHorse check : horses) {
                if (check.getDistance() > 1000.0) {
                    result = false;
                }
            }
        }

        RaceHorse max = horses[0];
        for (int i = 0; i < horses.length; i++) {
            if (horses[i].getDistance() > max.getDistance()) {
                max = horses[i];
            }
        }

        System.out.println("The winning horse is " + max.getName() + "!");
    }
}

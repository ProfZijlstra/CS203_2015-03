/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mzijlstra
 */
public class Question1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        frame.getContentPane().add(BorderLayout.CENTER, new JLabel("Hello World"));
        frame.setSize(150, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;

/**
 *
 * @author mzijlstra
 */
public class BorderLayoutTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        
        JButton nButton = new JButton("North");
        JButton sButton = new JButton("South");
        JButton eButton = new JButton("East");
        JButton wButton = new JButton("West");
        JButton cButton = new JButton("Center");
//        myButton.setSize(100, 100);
//        myButton.setPreferredSize(new Dimension(100,100));
//        Font myFont = new Font("Serif", Font.BOLD, 28);
//        myButton.setFont(myFont);
        
        frame.getContentPane().add(BorderLayout.CENTER, cButton);
        frame.getContentPane().add(BorderLayout.SOUTH, sButton);
        frame.getContentPane().add(BorderLayout.WEST, wButton);
        frame.getContentPane().add(BorderLayout.NORTH, nButton);
        frame.getContentPane().add(BorderLayout.EAST, eButton);
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

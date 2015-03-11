/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class FlowLayoutTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        JButton bigButton = new JButton("Click here");
        bigButton.setPreferredSize(new Dimension(100,100));
        
        panel.setBackground(Color.DARK_GRAY);
        panel.add(bigButton);
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));
        panel.add(new JButton("Button 10"));
        panel.add(new JButton("Button 11"));
        panel.add(new JButton("Button 12"));
        
        panel.setPreferredSize(new Dimension(200, 300));
        
        frame.getContentPane().add(BorderLayout.EAST, panel);
        

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class BoxLayoutTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton button1 = new JButton("Button 1");
        
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");
        JButton button11 = new JButton("Button 11");
        JButton button12 = new JButton("Button 12");
        //bigButton.setPreferredSize(new Dimension(100,100));
        
         button1.setSize(new Dimension(100, 15));
         button2.setSize(new Dimension(100, 15));
         button3.setSize(new Dimension(100, 15));
         button4.setSize(new Dimension(100, 15));
         button5.setSize(new Dimension(100, 15));
         button6.setSize(new Dimension(100, 15));
         button7.setSize(new Dimension(100, 15));
         button8.setSize(new Dimension(100, 15));
         button9.setSize(new Dimension(100, 15));
        button10.setSize(new Dimension(100, 15));
        button11.setSize(new Dimension(100, 15));
        button12.setSize(new Dimension(100, 15));
        
        panel.setBackground(Color.DARK_GRAY);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
//        panel.add(button10);
//        panel.add(button11);
//        panel.add(button12);
        
        //panel.setPreferredSize(new Dimension(200, 300));
        
        frame.getContentPane().add(BorderLayout.EAST, panel);
        

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

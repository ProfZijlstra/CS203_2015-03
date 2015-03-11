/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class Question2 {

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.go();
    }

    public void go() {
        JFrame frame = new JFrame("Hello World");
        frame.getContentPane().add(new DrawPanel());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private class DrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g){
            g.fillRect( 25, 220, 20, 30);
            g.fillRect( 50, 190, 20, 60);
            g.fillRect( 75, 160, 20, 90);
            g.drawRect( 100,130, 20, 120);
        }
    }

}

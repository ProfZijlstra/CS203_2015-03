/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static java.awt.BorderLayout.*;
import static javax.swing.JFrame.*;

/**
 *
 * @author mzijlstra
 */
public class Animation1 {

    private JFrame frame;
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        Animation1 a = new Animation1();
        a.go();
    }

    public void go() {
        frame = new JFrame("Moving ball");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        DrawPanel d = new DrawPanel();
        frame.getContentPane().add(CENTER, d);

        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 200; i++) {
            x++;
            y++;
            try {
                Thread.sleep(1000/60);
                frame.repaint();
            } catch (Exception e) {
            }
        }

    }

    public class DrawPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            //g.setColor(Color.black);
            //g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.blue);
            g.fillOval(x, y, 25, 25);
        }
    }

}

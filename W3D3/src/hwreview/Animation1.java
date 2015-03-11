/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

import java.awt.BorderLayout;

import static java.awt.BorderLayout.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.*;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class Animation1 {
    private static final int BALLSIZE = 25;

    private JFrame frame;
    private int x = 0;
    private int y = 0;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;

    public static void main(String[] args) {
        Animation1 a = new Animation1();
        a.go();
    }

    public void go() {
        frame = new JFrame("Moving ball");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        DrawPanel d = new DrawPanel();
        frame.getContentPane().add(CENTER, d);
        frame.addKeyListener(new MyKeyListener());

        frame.setSize(300, 300);
        frame.setVisible(true);

        while (true) {
            if (up && y > 0) {
                y -= 1;
            } else if (down && y < d.getHeight() - BALLSIZE) {
                y += 1;
            }
            if (left && x > 0) {
                x -= 1;
            } else if (right && x < d.getWidth() - BALLSIZE) {
                x += 1;
            }

            try {
                Thread.sleep(1000 / 60);
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
            g.fillOval(x, y, BALLSIZE, BALLSIZE);
        }
    }

    public class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            // we don't care
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                up = true;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                down = true;
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                left = true;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                up = false;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                down = false;
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                left = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = false;
            }
        }

    }
}

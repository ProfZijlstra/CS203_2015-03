/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mzijlstra
 */
public class MultiButtonExample {

    private JButton colorButton;
    private JButton labelButton;
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        MultiButtonExample g = new MultiButtonExample();
        g.go();
    }

    public void go() {
        frame = new JFrame("My awesome application!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        this.colorButton = new JButton("I'm a button");
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        colorButton.addActionListener(new ColorListener());

        labelButton = new JButton("Change label");
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        labelButton.addActionListener(new LabelListener());

        label = new JLabel("I'm a label");
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.getContentPane().add(BorderLayout.CENTER, new RandomColorPanel());

        frame.setVisible(true);
    }

    private class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    private class LabelListener implements ActionListener {
        private int count = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            count += 1;
            label.setText("You clicked: " + count);
        }
    }

}

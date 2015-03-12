/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class Poem extends JFrame {

    public static void main(String[] args) {
        new Poem();
    }

    public Poem() {
        super("Poem");

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Roses are grey"));

        JPanel p2 = new JPanel();
        p2.add(new JLabel("Violets are grey"));

        JPanel p3 = new JPanel();
        p3.add(new JLabel("Everything is grey"));

        JPanel p4 = new JPanel();
        p4.add(new JLabel("I'm color blind"));

        JPanel outer = new JPanel();
        outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));
        
        outer.add(p1);
        outer.add(p2);
        outer.add(p3);
        outer.add(p4);
        
        this.getContentPane().add(BorderLayout.CENTER, outer);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }
}

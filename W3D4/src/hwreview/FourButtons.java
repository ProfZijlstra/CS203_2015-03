/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class FourButtons extends JFrame {

    public FourButtons() {
        super("4Btns");

        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");
        JButton buttonD = new JButton("D");

        int size = 100;
        Dimension d = new Dimension(75,75);
        buttonA.setPreferredSize(d);
        buttonB.setPreferredSize(d);
        buttonC.setPreferredSize(d);
        buttonD.setPreferredSize(d);
        
        JPanel top = new JPanel();
        JPanel bot = new JPanel();
        
        top.add(buttonA);
        top.add(buttonB);
        bot.add(buttonC);
        bot.add(buttonD);

        JPanel outer = new JPanel();
        outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));

        outer.add(top);
        outer.add(bot);

        this.getContentPane().add(outer);
        this.setSize(170,190);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

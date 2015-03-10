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

/**
 *
 * @author mzijlstra
 */
public class GuiExample3 implements ActionListener {
    private JButton button;
    private JFrame frame;
    
    public static void main(String[] args) {
        GuiExample3 g = new GuiExample3();
        g.go();
    }
    
    public void go() {
        frame = new JFrame("My awesome application!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        this.button = new JButton("I'm a button");
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, new RandomColorPanel());
        
        
        button.addActionListener(this);
        
        frame.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //this.button.setText("Clickedy Click click");
        frame.repaint();
    }
    
}

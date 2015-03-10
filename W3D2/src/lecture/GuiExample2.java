/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mzijlstra
 */
public class GuiExample2 implements ActionListener {
    private JButton button;
    
    public static void main(String[] args) {
        GuiExample2 g = new GuiExample2();
        g.go();
    }
    
    public void go() {
        JFrame frame = new JFrame("My awesome application!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        this.button = new JButton("I'm a button");
        frame.getContentPane().add(button);
        button.addActionListener(this);
        
        frame.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.button.setText("Clickedy Click click");
    }
    
}

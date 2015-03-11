/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mzijlstra
 */
public class TextFieldTest {
        public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");

        JTextField field1 = new JTextField("starting text");
        JTextField field2 = new JTextField("starting text");
        JButton button = new JButton("Move text");
        JPanel panel = new JPanel();
        panel.add(field1);
        panel.add(button);
        panel.add(field2);
        
        //field1.selectAll();
        field2.requestFocus();
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

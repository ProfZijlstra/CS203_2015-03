/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mzijlstra
 */
public class GuiExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My awesome application!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        JButton button = new JButton("I'm a button");
        frame.getContentPane().add(button);
        
        
        frame.setVisible(true);
    }
    
}

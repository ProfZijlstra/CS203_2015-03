/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author mzijlstra
 */
public class TextAreaTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextArea area = new JTextArea(20, 3);
        area.setLineWrap(true);
        area.setPreferredSize(new Dimension(200,200));
        JScrollPane scroller = new JScrollPane(area);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        //scroller.add(area);
        
        JPanel panel = new JPanel();
        scroller.setPreferredSize(new Dimension(200,200));
        panel.add(scroller);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

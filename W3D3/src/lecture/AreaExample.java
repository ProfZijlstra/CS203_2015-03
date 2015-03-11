/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author mzijlstra
 */
public class AreaExample {
    private JButton button;
    private JTextArea area;
    
    public static void main(String[] args) {
        AreaExample a = new AreaExample();
        a.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        area = new JTextArea(20, 3);
        area.setLineWrap(true);
        
        
        JScrollPane scroller = new JScrollPane(area);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        button = new JButton("Add Text");
        button.addActionListener(new MyAction());
        
        
        frame.getContentPane().add(BorderLayout.CENTER, scroller);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    class MyAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //area.setText(area.getText() + "More Text\n");
            area.append("More Text\n");
        }
        
    }
}

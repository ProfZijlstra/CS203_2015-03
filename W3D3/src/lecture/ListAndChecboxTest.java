/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author mzijlstra
 */
public class ListAndChecboxTest {
    private JCheckBox check;
    
    public static void main(String[] args) {
        ListAndChecboxTest t = new ListAndChecboxTest();
        t.go();
    }
    
    public void go() {
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        String[] things = {"A","B","C","D","E","F","G","H","I","J"};
        JList list = new JList(things);
        panel.setPreferredSize(new Dimension(100, 100));
        
        check = new JCheckBox("Check this");
        check.addItemListener(new MyItemListener());
        panel.add(check);
        
        
        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
//        scroller.add(list);
        
        panel.add(scroller);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        
        
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);        
    }
    
    class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            
            if (check.isSelected()) {
                System.out.println("It's checked!");
            } else {
                System.out.println("It's unchecked!");
            }
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mzijlstra
 */
public class Calculator extends JFrame {
    private final JTextField field;

    public Calculator() {
        super("Awesome Calculator");

        field = new JTextField(14);
        field.setHorizontalAlignment(JTextField.RIGHT);
        JButton clear = new JButton("CL");
        clear.addActionListener(new ClearActionListener());

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton be = new JButton("=");
        JButton bp = new JButton(".");
        JButton ba = new JButton("+");
        JButton bm = new JButton("*");
        JButton bd = new JButton("/");
        JButton bs = new JButton("-");

        Dimension d = new Dimension(50, 50);

        b1.setPreferredSize(d);
        b2.setPreferredSize(d);
        b3.setPreferredSize(d);
        b4.setPreferredSize(d);
        b5.setPreferredSize(d);
        b6.setPreferredSize(d);
        b7.setPreferredSize(d);
        b8.setPreferredSize(d);
        b9.setPreferredSize(d);
        b0.setPreferredSize(d);
        be.setPreferredSize(d);
        bp.setPreferredSize(d);
        ba.setPreferredSize(d);
        bm.setPreferredSize(d);
        bd.setPreferredSize(d);
        bs.setPreferredSize(d);

        ButtonActionListener l = new ButtonActionListener();
        b1.addActionListener(l);
        b2.addActionListener(l);
        b3.addActionListener(l);
        b4.addActionListener(l);
        b5.addActionListener(l);
        b6.addActionListener(l);
        b7.addActionListener(l);
        b8.addActionListener(l);
        b9.addActionListener(l);
        b0.addActionListener(l);
        be.addActionListener(l);
        bp.addActionListener(l);
        ba.addActionListener(l);
        bm.addActionListener(l);
        bd.addActionListener(l);
        bs.addActionListener(l);

        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel row4 = new JPanel();
        JPanel row5 = new JPanel();

        row1.add(field);
        row1.add(clear);

        row2.add(b7);
        row2.add(b8);
        row2.add(b9);
        row2.add(ba);

        row3.add(b4);
        row3.add(b5);
        row3.add(b6);
        row3.add(bs);

        row4.add(b1);
        row4.add(b2);
        row4.add(b3);
        row4.add(bm);

        row5.add(bp);
        row5.add(b0);
        row5.add(be);
        row5.add(bd);

        JPanel outer = new JPanel();
        outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));
        outer.add(row1);
        outer.add(row2);
        outer.add(row3);
        outer.add(row4);
        outer.add(row5);

        this.getContentPane().add(outer);
        this.setSize(250, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            field.setText(field.getText() + b.getText());
        }
    }

    private class ClearActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText("");
        }
    }
}

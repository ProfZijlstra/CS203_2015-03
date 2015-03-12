/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mzijlstra
 */
public class AwesomeCalculator extends JFrame {

    private JTextField field;

    public static void main(String[] args) {
        new AwesomeCalculator();
    }

    public AwesomeCalculator() {
        super("Awesome Calculator");

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
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bm = new JButton("*");
        JButton bd = new JButton("/");
        JButton be = new JButton("=");
        JButton bp = new JButton(".");

        ButtonActionListener bal = new ButtonActionListener();

        b1.addActionListener(bal);
        b2.addActionListener(bal);
        b3.addActionListener(bal);
        b4.addActionListener(bal);
        b5.addActionListener(bal);
        b6.addActionListener(bal);
        b7.addActionListener(bal);
        b8.addActionListener(bal);
        b9.addActionListener(bal);
        b0.addActionListener(bal);
        ba.addActionListener(bal);
        bs.addActionListener(bal);
        bm.addActionListener(bal);
        bd.addActionListener(bal);
        be.addActionListener(bal);
        bp.addActionListener(bal);

        field = new JTextField(14);
        field.setHorizontalAlignment(JTextField.RIGHT);
        JButton bc = new JButton("cl");
        bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("");
            }
        }); 
        

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.add(field);
        p1.add(bc);

        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(ba);

        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(bs);

        p4.add(b1);
        p4.add(b2);
        p4.add(b3);
        p4.add(bm);

        p5.add(bp);
        p5.add(b0);
        p5.add(be);
        p5.add(bd);

        JPanel outer = new JPanel();
        outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));

        outer.add(p1);
        outer.add(p2);
        outer.add(p3);
        outer.add(p4);
        outer.add(p5);

        this.getContentPane().add(outer);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            field.setText(field.getText() + button.getText());
        }

    }
}

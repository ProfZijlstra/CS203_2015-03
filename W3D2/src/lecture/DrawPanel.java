/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class DrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(20, 30, 70, 50);
        g.fillRect(100, 100, 50, 70);
    }
}

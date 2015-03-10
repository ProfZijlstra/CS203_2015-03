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
public class RandomColorPanel extends JPanel {
    @Override
    public void paintComponent(Graphics gr) {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        
        Color color = new Color(r, g, b);
        
        gr.setColor(color);
        gr.drawOval(20, 30, 70, 50);
        gr.fillRect(100, 100, 50, 70);
    }
}

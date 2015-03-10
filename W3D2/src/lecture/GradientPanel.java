/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class GradientPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint paint = new GradientPaint(0, 150, Color.GREEN, 300, 150, Color.RED);
        g2d.setPaint(paint);
        g2d.fillRect(0, 0, 300, 300);
    }
}

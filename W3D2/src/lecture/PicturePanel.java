/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author mzijlstra
 */
public class PicturePanel extends JPanel {
    public void paintComponent(Graphics g) {
        ImageIcon image = new ImageIcon("cat.jpg");
        g.drawImage(image.getImage(), 0, 0, this);
    }
}

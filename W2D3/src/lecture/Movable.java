/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

/**
 *
 * @author mzijlstra
 */
public interface Movable {
    int getX();
    int getY();
    int moveUp(int amount);
    int moveDown(int amount);
    int moveLeft(int amount);
    int moveRight(int amount);  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author mzijlstra
 */
public class DeSerialize {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("MyGame.sav");
            ObjectInputStream ois = new ObjectInputStream(fis);
            GameCharacter gc1 = (GameCharacter) ois.readObject();
            GameCharacter gc2 = (GameCharacter) ois.readObject();
            
            System.out.println(gc1.getName() + " and " + gc2.getName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

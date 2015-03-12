/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author mzijlstra
 */
public class Serialize {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        GameCharacter gc1 = new GameCharacter("Conan", 100, 18, 15, 16, 10, 12, 8);
        gc1.addItem(new Item("Sword", 15));
        GameCharacter gc2 = new GameCharacter("Merlin", 75, 10, 12, 12, 18, 17, 12);
        gc2.addItem(new Item("Wand", 1));
        
        FileOutputStream fos = new FileOutputStream("MyGame.sav");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(gc1);
        oos.writeObject(gc2);
        
        oos.close();
    }
}

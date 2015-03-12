/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mzijlstra
 */
public class MyNewCopy {
    public static void main(String[] args) {
        try {
            System.out.println("Reading from and writing to directory: " + System.getProperty("user.dir"));
            String text = new String(Files.readAllBytes(Paths.get("input.txt")));
            Files.write(Paths.get("/tmp/output.txt"), text.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(MyNewCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

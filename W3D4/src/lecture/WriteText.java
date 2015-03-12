/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mzijlstra
 */
public class WriteText {
    public static void main(String[] agrs) {
        try {
            Files.write(Paths.get("out.txt"), "Hello World".getBytes());
        } catch(Exception e) { }
        
        try {
            FileWriter writer = new FileWriter("out.txt");
            writer.write("Hello World!");
            writer.close();
        } catch (Exception ex) { }
    }
}

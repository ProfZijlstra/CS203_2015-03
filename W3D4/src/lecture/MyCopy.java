/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mzijlstra
 */
public class MyCopy {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            String line = br.readLine();
            while (line != null) {
                fw.write(line);
                fw.write("\n");
                line = br.readLine();
            }

            br.close();
            bw.close();
            
        } catch (FileNotFoundException ex) {
            
        } catch(IOException e) { 
            
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(MyCopy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class replace {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Need 4 arguments");
            return;
        }
        
        ArrayList<String> lines = new ArrayList<>();
        
        // read all the lines
        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while (line != null) {
                lines.add(line);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            
        }
        
        ArrayList<String> updated = new ArrayList<>();
        // process all the lines
        for (String line : lines) {
            String[] words = line.split(" ");
            
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (word.equals(args[2])) {
                    sb.append(args[3]);
                } else {
                    sb.append(word);
                }                

                sb.append(" ");
            }
            updated.add(sb.toString());
        }
        
        try {
            // write the updated lines to new file
            FileWriter fw = new FileWriter(args[1]);
            BufferedWriter br = new BufferedWriter(fw);
            for (String line : updated) {
                br.write(line);
                br.write("\n");
            }
            br.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}

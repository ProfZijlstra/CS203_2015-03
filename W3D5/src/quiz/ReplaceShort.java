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

/**
 *
 * @author mzijlstra
 */
public class ReplaceShort {

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Need 4 arguments");
            return;
        }
        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(args[1]);
            BufferedWriter bw = new BufferedWriter(fw);

            String line = br.readLine();
            while (line != null) {
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
                bw.write(sb.toString());
                bw.write("\n");
                line = br.readLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {

        }

    }
}

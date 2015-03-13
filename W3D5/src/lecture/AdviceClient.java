/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author mzijlstra
 */
public class AdviceClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader stream = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(stream);
            
            String advice = reader.readLine();
            System.out.println(advice);
            
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

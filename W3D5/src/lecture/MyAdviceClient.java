/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author mzijlstra
 */
public class MyAdviceClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.10.10.68", 80);

        PrintWriter writer = new PrintWriter(s.getOutputStream());
        writer.println("GET /quote.php HTTP/1.1");
        writer.println("host: mumstudents.org");
        writer.println("");
        writer.flush();

        InputStreamReader stream = new InputStreamReader(s.getInputStream());
        BufferedReader reader = new BufferedReader(stream);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        writer.close();
        reader.close();
    }
}

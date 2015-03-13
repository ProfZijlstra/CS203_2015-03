/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mzijlstra
 */
public class AdviceServer {

    private static String[] adviceList = {"Take smaller bites", "Do things", 
        "Exercise", "Go to sleep, really!"};

    public static void main(String[] args) {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while (true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                int random = (int)(Math.random() * adviceList.length);
                String advice = adviceList[random];
                writer.println(advice);
                writer.close();
                System.out.println("I said "+ advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
}

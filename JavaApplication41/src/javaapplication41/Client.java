/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.net.*;
import java.io.*;


/**
 *
 * @author lenovo
 */
public class Client {
    public static void main(String args[])
	{	
    Socket socket = null;
		try{
		socket = new Socket("127.0.0.1", 6000);
                //socket = new Socket("192.168.1.12", 80);
                 System.err.println("Nawiazano polaczenie!");
                 System.out.println(socket);
		}
		catch(UnknownHostException e){
			System.out.println("Nieznany host");
		}
		catch(IOException e){
			System.out.println(e);
		}                
	}


    
}

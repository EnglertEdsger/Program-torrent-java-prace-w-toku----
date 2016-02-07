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
public class Server {


 @SuppressWarnings({"null", "ConstantConditions"})
 public static void main(String args[]) throws IOException {
   	ServerSocket server_socket = null;
  		InetSocketAddress address;
		Socket socket;
                
                try {
	server_socket = new ServerSocket();
	//address = new InetSocketAddress(80);
        address = new InetSocketAddress(6000);
	server_socket.bind(address);
	System.out.println("Serwer nasluchuje...");
	socket = server_socket.accept();
	System.out.println("Zglosil sie klient");
	System.err.println("Podlaczyl sie z adresu: " + socket.getInetAddress() );
}
catch (Exception e) {
	System.err.println( e.getMessage() );
}
server_socket.close();                
    }
}


    


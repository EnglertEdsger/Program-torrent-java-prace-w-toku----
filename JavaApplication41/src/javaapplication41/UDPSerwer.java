/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

//import java.net.DatagramPacket;
//import java.net.DatagramSocket;
//import java.net.SocketException;

//import java.net.InetAddress;
import java.net.*;
import java.io.*;


/**
 *
 * @author lenovo
 */
public class UDPSerwer implements Runnable {
      byte[] ip ={127,0,0,1};
    DatagramSocket socket =null;

int port =7;
public UDPSerwer() {
    try{
    socket= new DatagramSocket(port);
}catch (SocketException e){}
    
}
//@Override public void run(){
      @Override
     public void run(){

try{
    while(true){
        byte[] buf=new byte[256];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        InetAddress remIP=packet.getAddress();
        int remPort=packet.getPort();
        String msg=new String(packet.getData(),0,packet.getLength());
        System.out.println("Od :" + remIP + " port: " + remPort + " wiadomość: " + msg);
        msg += " Odbite";  
        packet.setData(msg.getBytes());
        socket.send(packet);
    } 
}catch(IOException e){
    } finally {socket.close();}
}
public static void main(String[] arg){
    new Thread(new UDPSerwer()).start();
    }
        
    }

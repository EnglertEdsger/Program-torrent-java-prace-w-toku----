/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.net.DatagramSocket;
import java.net.*;
import java.io.*;


/**
 *
 * @author lenovo
 */
public class UDPClient {
    
 public static void main(String[] arg){
    int port =7;
    String msg="Ala ma kota!";
    byte[] ip ={127,0,0,1};
    DatagramSocket socket =null;
    try{
    byte[] udpMsg=msg.getBytes();
    System.out.println("Wiadomość wysłana :" +msg);
    socket=new DatagramSocket();
    DatagramPacket packetSend=new DatagramPacket(udpMsg,udpMsg.length,InetAddress.getByAddress(ip),port);
    socket.send(packetSend);
    byte[] udpMsgR=new byte[256];
    DatagramPacket packetReceive=new DatagramPacket(udpMsgR,udpMsgR.length);
    socket.receive(packetReceive);
    String msgRs;
        msgRs = new String(packetReceive.getData(),0,packetReceive.getLength());
    System.out.println("Wiadomość odebrana :" +msgRs);
}
    catch(SocketException e){
}catch(UnknownHostException e){
}catch(IOException e){
} finally { if (socket != null) socket.close();}
    
    
}}

 
    


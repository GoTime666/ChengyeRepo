package udp.send;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import org.junit.jupiter.api.Test;

public class UDPSend {
	public static void main(String[] args) throws IOException {
		DatagramSocket sendSocket=new DatagramSocket();
		System.out.println(sendSocket.getLocalPort());
		
		byte[] buffer="hello,UDP".getBytes();
		DatagramPacket dp=new DatagramPacket(buffer, buffer.length,InetAddress.getByName("192.168.1.3"),12306);
		
		sendSocket.send(dp);
		sendSocket.close();
	}
	
	
	@Test
	public void fun1() throws IOException {
		DatagramSocket sendSocket=new DatagramSocket();
		File file=new File("D:\\UDP\\json2.js");
		FileInputStream in=new FileInputStream(file);
		ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
		byte[] buffer=new byte[1024];
		int len=-1;
		while((len=in.read())!=-1) {
			outputStream.write(buffer, 0, len);
		}
		DatagramPacket dp=new DatagramPacket(buffer, buffer.length,InetAddress.getByName("192.168.1.3"),12306);
		sendSocket.send(dp);
		sendSocket.close();
	}
}

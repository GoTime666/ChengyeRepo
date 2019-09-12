package udp.receive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

public class UDPReceive {
	private static Log logger=LogFactory.getLog(UDPReceive.class);
	
	@Test
	public void fun1() throws IOException {
		DatagramSocket socket=new DatagramSocket(8889,InetAddress.getByName("192.168.1.3"));
		String path="D:\\UDP";
		File file=new File(path);
		byte[] buffer=new byte[1024];
		InputStream in=new FileInputStream(file);
		int c=in.read();
		DatagramPacket packet=new DatagramPacket(buffer,c);
		socket.send(packet);
		in.close();
	}
}

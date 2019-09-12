package tcp.client;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.1.3", 8888);
		InputStream in = s.getInputStream();
		byte[] buffer = new byte[1024];
		int length = in.read(buffer);
		System.out.println(new String(buffer, 0, length));
		in.close();
		s.close();
	}

	@Test
	public void fun1() throws UnknownHostException, IOException {
		Socket socket=new Socket("192.168.1.3",8888);
		OutputStream out=socket.getOutputStream();
		BufferedInputStream fileIn=new BufferedInputStream(new FileInputStream("D:\\电影\\寄生虫.1080p.HD中字\\寄生虫.1080p.HD中字[66影视www.66Ys.Co].mp4"));
		byte[] buffer=new byte[1024];
		int len=-1;
		while((len=fileIn.read(buffer))!=-1) {
			out.write(buffer, 0, len);
		}
		socket.shutdownOutput();
		
		InputStream in=socket.getInputStream();
		byte[] info=new byte[1024];
		int length=in.read(info);
		System.out.println(new String(info,0,length));
		in.close();
		fileIn.close();
		out.close();
		socket.close();
		
	}
}

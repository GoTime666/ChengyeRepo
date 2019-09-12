package tcp.server;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;



public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		OutputStream out = s.getOutputStream();
		out.write("你已经连上服务器".getBytes());
		out.close();
	}

	@Test
	public void fun1() throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket clientSocket = serverSocket.accept();
		InetAddress ipObject = clientSocket.getInetAddress();
		String ip = ipObject.getHostAddress();
		System.out.println("小样,抓到你了,链接我" + "IP: " + ip);
		InputStream in = clientSocket.getInputStream();
		// java路径要用\\或//
		/*
		 * String location="D:\\game\\九阴真经.rar"; File file=new File(location);
		 * file.getName();
		 */
		BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("D:\\TCP\\寄生虫.mp4"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len=in.read(buffer))!=-1){
			fileOut.write(buffer, 0, len);
		}
		OutputStream out=clientSocket.getOutputStream();
		out.write("文件上传成功".getBytes());
		out.close();
		fileOut.close();
		in.close();
		clientSocket.close();
	}
	
	@Test
	public void test2() throws IOException {
		
		FileUtils.copyFile(new File("D:\\IO\\spring-tool-suite-3.9.9.RELEASE-e4.12.0-win32-x86_64.zip"), new File("D:\\IO\\copy(rar).rar"));
	}
	

}

package inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

public class Test1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress localhost = InetAddress.getLocalHost();
		InetAddress[] remote = InetAddress.getAllByName("www.baidu.com");
		System.out.println("本机的ip地址 " + localhost.getHostAddress() + /* "\n百度的" + "ip地址:" + remote.getHostAddress() */
		/* + "\n百度的主机名:" + */ /* remote.getHostName()  +*/ "  ");
		for (InetAddress inetAddress : remote) {
			String hostAddress = inetAddress.getHostAddress();
			System.out.println(hostAddress);
		}
		System.out.println("address : "+InetAddress.getByName("www.baidu.com").getHostAddress());
	}

	@Test
	public void fun1() {

	}
}

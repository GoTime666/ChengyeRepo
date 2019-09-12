package threadSafe;

public class ThreadNotSafeDemo {
	public static void main(String[] args) {
		TicketNotSafe ticket = new TicketNotSafe();
		/*
		 * new Thread(ticket,"窗口1").start(); new Thread(ticket,"窗口2").start(); new
		 * Thread(ticket,"窗口3").start();
		 */

		Thread t1 = new Thread(ticket, "窗口1");
		Thread t2 = new Thread(ticket, "窗口2");
		Thread t3 = new Thread(ticket, "窗口3");
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}

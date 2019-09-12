package threadSafe;

import lock.LockTicket;

public class ThreadSafeDemo {
	public static void main(String[] args) {
		// 线程不安全
		// Ticket ticket = new TicketNotSafe();

		// 线程安全
		// Ticket ticket = new TicketSafeSynchronizedBlock();

		// 线程安全
		//Ticket ticket = new TicketSafeSynchronizedFunction();
		
		//Lock接口
		Ticket ticket = new LockTicket();

		Thread t1 = new Thread(ticket, "窗口1");
		Thread t2 = new Thread(ticket, "窗口2");
		Thread t3 = new Thread(ticket, "窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public static void fun() {
		System.out.println("11");
		return;
	}
}

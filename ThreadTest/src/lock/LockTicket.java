package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import threadSafe.Ticket;

public class LockTicket extends Ticket {

	/*
	 * public static void main(String[] args) { int i=0; while(true) {
	 * System.out.println("死循环"+i); i++; if(i>500) return; } } public static void
	 * fun1() { System.out.println("死循环"); }
	 */

	int ticket = 100;

	Lock ck = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			ck.lock();
			if (ticket > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖票:"+ticket--);
			}else {
				break;
			}
			ck.unlock();
		}
	}

}

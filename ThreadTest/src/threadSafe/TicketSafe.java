package threadSafe;

public class TicketSafe extends Ticket {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ticket <= 100 && ticket > 2) {
			synchronized (lock) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
			}
		}

	}

}

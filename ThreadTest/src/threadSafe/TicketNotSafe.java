package threadSafe;

public class TicketNotSafe extends Ticket {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (ticket > 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
			} else {
				return;
			}
		}
	}

}

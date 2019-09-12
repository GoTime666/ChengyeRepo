package threadSafe;

public class TicketSafeSynchronizedFunction extends Ticket{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			method();
			if(ticket==1)
				return;
		}
	}
	
	public synchronized  void method() {
		// TODO Auto-generated method stub
		if(ticket>0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在卖票: "+ticket--);
		}else {
			return;
		}
		
		
	}

	
	

}

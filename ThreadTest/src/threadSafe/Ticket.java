package threadSafe;

public class Ticket implements Runnable{
	protected  int ticket=100;
	protected Object lock=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

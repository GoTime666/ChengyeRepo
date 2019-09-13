package daemon;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++) {
			Thread daemon=new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.println("All daemons started");
		TimeUnit.SECONDS.sleep(1);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(400);
				System.out.println(Thread.currentThread()+" "+this);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Sleep() interrupted");
			}
		}
	}
	
}

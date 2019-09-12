package runnable;

public class MyRunnableWithYield implements Runnable {
	
	public MyRunnableWithYield() {
		System.out.println("任务启动");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("run");
			Thread.yield();
		}
	}

}

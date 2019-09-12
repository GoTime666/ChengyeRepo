package runnable;

public class MyRunnableWithYield implements Runnable {

	public MyRunnableWithYield() {
		System.out.println("任务启动");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " run " + i);
			Thread.yield();
		}
	}

}

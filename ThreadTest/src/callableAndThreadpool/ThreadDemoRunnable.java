package callableAndThreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemoRunnable {
	public static void main(String[] args) {
		//ExecutorService service = Executors.newFixedThreadPool(4);
		ExecutorService service = Executors.newCachedThreadPool();
		// MyRunnable r=new MyRunnable();
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i < 100; i++)
					System.out.println(Thread.currentThread().getName() + "   " + i);
			}
		};
		Future<?> future = service.submit(r);
		service.submit(r);
		service.submit(r);
		service.submit(r);
		service.submit(r);
		service.submit(r);
		service.submit(r);
		service.submit(r);

		// 关闭线程池
		service.shutdown();

	}

}

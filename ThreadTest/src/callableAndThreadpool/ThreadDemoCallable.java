package callableAndThreadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemoCallable {
	public static  void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(2);
		Callable<Object> c=new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("我要一个教练:call\n");
				Thread.sleep(2000);
				System.out.println("教练来了:  "+Thread.currentThread().getName());
				System.out.println("教我游泳,教完后,教练回到了游泳池\n");
				return null;
			}
		};
		service.submit(c);
		service.submit(c);
		service.submit(c);
		service.submit(c);
		
		service.shutdown();
		
	}
}

package callableAndThreadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemoCallableReturnValue {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		//Callable<Integer> c=new MyCallableSum();
		MyCallableSum c1=new MyCallableSum(100,200);
		MyCallableSum c2=new MyCallableSum(10,20);
		Future<Integer> result1 = threadPool.submit(c1);
		Future<Integer> result2 = threadPool.submit(c2);
		Integer sum1 = result1.get();
		Integer sum2 = result2.get();
		System.out.println("sum1:"+sum1+"\nsum2:"+sum2);
		
		threadPool.shutdown();
	}
}

package callableAndThreadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;

public class ThreadDemoCallableReturnValue {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService threadPool=Executors.newFixedThreadPool(2);
		ExecutorService threadPool=Executors.newCachedThreadPool();
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
	
	
	public static void clearConsole()
	{
	    try
	    {
	        String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (Exception exception)
	    {
	        //  Handle exception.
	    	exception.printStackTrace();
	    }
	}
	
	
	@Test
	public void fun1() throws InterruptedException {
		for(int i=10;i>=0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
			clearConsole();
			if(i==0)
				System.out.println("发射");
		}
	}
	
	@Test
	public void fun2() throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
		Thread.sleep(1000);
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}

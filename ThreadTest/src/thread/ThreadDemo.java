package thread;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1=new MyThread1("我的线程1");
		t1.start();
		//Thread.sleep(2);
		for(int i=1;i<100;i++)
			System.out.println("主线程:   "+i);
		Thread.yield();
		System.out.println("tom");
	}
}

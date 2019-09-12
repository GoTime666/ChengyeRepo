package lock;

import org.junit.jupiter.api.Test;

public class ResourceDemo {
	public static void main(String[] args) {
		Resource r = new Resource();
		Input in = new Input(r);
		Output out = new Output(r);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
	}
	int i = 0;
	@Test
	public void f() {
		long start = System.currentTimeMillis();
		long time = 5000;
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				i++;
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}).start();
		while ((System.currentTimeMillis() - start) < time) {
			System.out.println(i);
			i++;
		}
	}
}

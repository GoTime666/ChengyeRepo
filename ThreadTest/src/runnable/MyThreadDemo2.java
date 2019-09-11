package runnable;

public class MyThreadDemo2 {
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1, "Runnable建的线程1");
		t1.start();
		
		//内部类定义很方便,
		//前提:必须要是父类或是接口
		//节省类的定义
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++)
					System.out.println("内部类Runnable   "+i);
			}
		});
		t2.start();
		for (int i = 1; i < 100; i++)
			System.out.println("主线程:   " + i);
	}
}

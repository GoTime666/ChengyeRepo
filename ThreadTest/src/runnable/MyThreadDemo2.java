package runnable;

public class MyThreadDemo2 {
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable();
		new Thread(r1, "Runnable建的线程1").start();
		
		//内部类定义很方便,
		//前提:必须要是父类或是接口
		//节省类的定义
		
		//当对象对方法仅进行一次调用的时候，就可以简化成匿名对象
		//匿名对象可以作为实际参数进行传递
		//优化代码
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++)
					System.out.println("内部类Runnable   "+i);
			}
		}).start();
		
		for (int i = 1; i < 100; i++)
			System.out.println("主线程:   " + i);
	}
}

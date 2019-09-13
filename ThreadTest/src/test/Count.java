package test;

public class Count implements Runnable {
	private int count = 0;
	Object mutex = new Object();
	long start=System.currentTimeMillis();

	public Count() {
		System.out.println(start);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (mutex) {
			while (count++ <= 100) {
				System.out.println(count);

			}
			if (this.count == 99) {
				long end = System.currentTimeMillis();
				System.out.println(end - start);
			}

		}

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static void main(String[] args) {
		fun();
	}

	public static void fun() {
		int j = 5;
		Count c = new Count();
		for (int i = 0; i < j; i++)
			new Thread(c).start();

	}

}

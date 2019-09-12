package lock;

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadTask task=new ThreadTask();
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		t1.start();
		t2.start();
	}
}

package runnable;

public class ThreadDemoWithYield {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
			new Thread(new MyRunnableWithYield()).start();
	}
}

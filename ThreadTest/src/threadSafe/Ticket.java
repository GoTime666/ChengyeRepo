package threadSafe;

public abstract class Ticket implements Runnable{
	protected  int ticket=100;
	protected Object lock=new Object();
}

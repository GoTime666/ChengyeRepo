package lock;

//模拟资源类
public class Resource {
	private String name;
	private String sex;
	private boolean flag = false;

	public synchronized void set(String name, String sex) {
		if (flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}

	public synchronized void out() {
		if (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("姓名: " + name + ",性别: " + sex);
		flag = false;
		this.notify();

	}
}

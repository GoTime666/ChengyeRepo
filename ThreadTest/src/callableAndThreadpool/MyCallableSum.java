package callableAndThreadpool;

import java.util.concurrent.Callable;

public class MyCallableSum implements Callable<Integer>{
	private Integer x=5;
	private Integer y=3;
	
	public MyCallableSum() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public MyCallableSum(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		return x+y;
	}

}

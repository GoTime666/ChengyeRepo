package test;

public class Zi extends Fu {

	@Override
	public void fun1() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Fu fu = new Fu() {

			@Override
			public void fun1() {
				// TODO Auto-generated method stub

			}

			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				super.fun2();
			}
			
			

		};
	}

}

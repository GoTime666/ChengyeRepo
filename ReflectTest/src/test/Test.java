package test;

public class Test {
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("dynamic block");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.getClass();
		Test t2=new Test();
		
	}
}

package test;

import org.junit.jupiter.api.Test;

public class Tes {
	Integer a=1;
	@Test
	public void fun1() {
		
		Tes t=new Tes();
		System.out.println(System.class.getName()+t.getClass());
		t=null;
		try {
			
			System.out.println(Class.forName("test.Tes"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

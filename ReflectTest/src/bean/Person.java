package bean;

public class Person {
	public String name;
	public int age;
	private String address;

	public Person() {
		System.out.println("空参数构造方法");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("带有String的构造方法");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("带有String ,int的构造方法");
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("带有String,int,String的构造方法");
	}
	
	public int method3() {
		System.out.println("有返回值,没有参数的方法");
		return 123;
	}
	
	public String method4(String name) {
		System.out.println("有返回值");
		return "哈哈"+name;
	}
	
	private void method5() {
		System.out.println("私有方法");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}

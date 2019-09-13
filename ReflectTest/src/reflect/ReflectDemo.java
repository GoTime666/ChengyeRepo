package reflect;

import bean.Person;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Person p=new Person();
		Class<? extends Person> class1 = p.getClass();
		Class<Person> c=Person.class;
		Class<?> class2 = Class.forName("bean.Person");
		System.out.println("p.getClass() "+class1);
		System.out.println("Person.class "+c);
		System.out.println("Class.forName() "+class2);
	}
}

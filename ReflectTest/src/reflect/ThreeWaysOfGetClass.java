package reflect;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;

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
	
	@Test
	public void fun1() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> class1 = Class.forName("bean.Person");
		Constructor<?>[] constructors = class1.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println();
		
		Constructor<?>[] declaredConstructors = class1.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		System.out.println();
		
		Constructor<?> constructor = class1.getConstructor(null);
		System.out.println(constructor);
		
		Constructor<?> constructor2 = class1.getConstructor(String.class);
		System.out.println(constructor2);
		
		Constructor<?> declaredConstructor = class1.getDeclaredConstructor(String.class,int.class);
		System.out.println(declaredConstructor);
		
		Constructor<?> declaredConstructor2 = class1.getDeclaredConstructor(String.class,int.class,String.class);
		System.out.println(declaredConstructor2);
		
		
		
	}
}

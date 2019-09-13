package reflect;

import java.lang.reflect.Constructor;

public class GetConstructors {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
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
		
		Constructor<?> constructor = class1.getConstructor();
		System.out.println("空参构造法: "+constructor);
		
		Constructor<?> constructor2 = class1.getConstructor(String.class);
		System.out.println(constructor2);
		
		Constructor<?> declaredConstructor = class1.getDeclaredConstructor(String.class,int.class);
		System.out.println(declaredConstructor);
		
		Constructor<?> declaredConstructor2 = class1.getDeclaredConstructor(String.class,int.class,String.class);
		System.out.println(declaredConstructor2);
	}
}

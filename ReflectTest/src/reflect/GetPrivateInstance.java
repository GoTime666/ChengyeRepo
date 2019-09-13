package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetPrivateInstance {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> class1 = Class.forName("bean.Person");
		Constructor<?> declaredConstructor = class1.getDeclaredConstructor(String.class,int.class);
		declaredConstructor.setAccessible(true);
		Object object = declaredConstructor.newInstance("小明",23);
		System.out.println(object);
	}
}

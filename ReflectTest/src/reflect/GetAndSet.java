package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetAndSet {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<?> class1 = Class.forName("bean.Person");
		
		Constructor<?> constructor = class1.getConstructor(String.class);
		
		Object obj = constructor.newInstance("小明");
		
		Field nameField = class1.getField("name");
		Field ageField = class1.getField("age");
		Field addressField = class1.getDeclaredField("address");
		addressField.setAccessible(true);
		
		System.out.println("name = "+nameField.get(obj));
		System.out.println("age = "+ageField.get(obj));
		System.out.println("address = "+addressField.get(obj));
		
		ageField.set(obj, 23);
		addressField.set(obj, "凯利广场");
		
		System.out.println();
		System.out.println("name = "+nameField.get(obj));
		System.out.println("age = "+ageField.get(obj));
		System.out.println("address = "+addressField.get(obj));
		
	}
}

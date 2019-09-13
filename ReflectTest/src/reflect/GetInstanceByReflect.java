package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetInstanceByReflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> class1 = Class.forName("bean.Person");
		Constructor<?> constructor = class1.getConstructor(String.class,int.class,String.class);
		Object instance = constructor.newInstance("小明",22,"哈尔滨");
		System.out.println(instance);
		
	}
}

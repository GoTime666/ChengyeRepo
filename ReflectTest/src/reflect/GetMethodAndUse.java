package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethodAndUse {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> class1 = Class.forName("bean.Person");
		// Method[] methods = class1.getMethods();
		for (Method method : class1.getMethods()) {
			System.out.println(method);
		}
		System.out.println();

		for (Method method : class1.getDeclaredMethods()) {
			System.out.println(method);
		}
		System.out.println();

		Method method1 = class1.getMethod("method1");
		System.out.println(method1);

		Method method4 = class1.getMethod("method4", String.class);
		System.out.println(method4);

		Method method5 = class1.getDeclaredMethod("method5");
		method5.setAccessible(true);
		System.out.println(method5);

		Constructor<?> constructor = class1.getConstructor();
		Object obj = constructor.newInstance();
		Object invoke = method5.invoke(obj);
		System.out.println(invoke);
	}
}

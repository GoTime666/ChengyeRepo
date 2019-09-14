package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class NewObjectByProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src\\properties\\person.properties"));
		String className = prop.getProperty("className");
		String methodName=prop.getProperty("methodName");
		System.out.println(className);

		Class<?> class1 = Class.forName(className);
		Constructor<?> constructor = class1.getDeclaredConstructor();
		Object obj = constructor.newInstance();
		Method method5 = class1.getDeclaredMethod(methodName);
		method5.setAccessible(true);
		method5.invoke(obj);
		
	}
}

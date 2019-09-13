package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import bean.Person;

public class GetInstance {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> class1 = Class.forName("bean.Person");
		Constructor<?> constructor = class1.getConstructor(String.class,int.class,String.class);
		
		//比较区别  分别使用Object和Person
		Object instance = constructor.newInstance("小明",22,"哈尔滨");
		//Person instance = (Person)constructor.newInstance("小明",22,"哈尔滨");
		System.out.println(instance);
		
	}
}

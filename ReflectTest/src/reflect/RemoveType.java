package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class RemoveType {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		Class<?> class1 = Class.forName("java.util.ArrayList");
		Method add = class1.getMethod("add", Object.class);
		Object result = add.invoke(list, "英语");
		
		System.out.println(list);
	}
}

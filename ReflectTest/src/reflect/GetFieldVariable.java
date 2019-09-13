package reflect;

import java.lang.reflect.Field;

public class GetFieldVariable {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> class1 = Class.forName("bean.Person");
		Field[] fields = class1.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println();
		Field[] declaredFields = class1.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}
		System.out.println();
		Field ageField = class1.getField("age");
		System.out.println(ageField);
		System.out.println();
		
		//获取非public成员变量
		Field addressField = class1.getDeclaredField("address");
		System.out.println(addressField);
		
		
	}
}

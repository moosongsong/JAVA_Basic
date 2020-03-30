package Part11Main;

import java.lang.reflect.Field;

class Coco{
	String name;
	int age;
}

public class 리플랙션_Test_491 {

	public static void main(String[] args) {
		Coco co = new Coco();
		Class c = co.getClass();
		
		Field[]fs=c.getDeclaredFields();
		
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
			System.out.println(fs[i].getModifiers()+" "+fs[i].getName());
		}
	}

}

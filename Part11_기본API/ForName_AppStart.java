package Part11Main;

import java.util.Scanner;
class BigPerson{
	
}

public class ForName_AppStart {

	public static void main(String[] args) {
		
//		Class cls =null;
		try {
//			cls = Class.forName("BigPerson");
//			Class.forName("BigPerson");
			Class.forName("java.util.Scanner");//����̹� ��ġ�Ǿ� �ִ��� Ȯ���Ҷ� ���
			
			System.out.println("find Driver!!!!");
//			BigPerson p = (BigPerson) cls.newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("����");
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
	}

}

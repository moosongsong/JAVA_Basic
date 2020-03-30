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
			Class.forName("java.util.Scanner");//드라이버 설치되어 있는지 확인할때 사용
			
			System.out.println("find Driver!!!!");
//			BigPerson p = (BigPerson) cls.newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("실팽");
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
	}

}

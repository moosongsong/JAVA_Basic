package Part10Main;

import java.io.IOException;

class A{
	
}
class B extends A{
	
}

class AppStart {
	public void a() throws NumberFormatException{
		b();
	}
	
	public void b() throws NumberFormatException{
		c();
	}
	
	private void c() throws NumberFormatException{
		String str = "�����ϻ�";
		double d = Double.parseDouble(str);
		System.out.println(d);
	}
}



public class T_TestPage429 {

	public static void main(String[] args)// throws IOException //,NumberFormatException
	{
		// TODO Auto-generated method stub
		try {
			System.out.print("�����Է�>");
			int n = System.in.read();
			int a =10/0;
		} catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
			System.out.println("����� ���� �߻�");
		} catch (ArithmeticException e) {
			System.out.println("������� �߻�");
			e.printStackTrace();
		}
		finally {
			System.out.println("ó������");
		}
		
		
		
		
//		AppStart app = new AppStart();
//		try {
//			app.a();
//		} catch (Exception e) {
//			System.out.println("sdhad");
//		}
		
	}

}

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
		String str = "삼점일사";
		double d = Double.parseDouble(str);
		System.out.println(d);
	}
}



public class T_TestPage429 {

	public static void main(String[] args)// throws IOException //,NumberFormatException
	{
		// TODO Auto-generated method stub
		try {
			System.out.print("문자입력>");
			int n = System.in.read();
			int a =10/0;
		} catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
			System.out.println("입출력 오류 발생");
		} catch (ArithmeticException e) {
			System.out.println("연산오류 발생");
			e.printStackTrace();
		}
		finally {
			System.out.println("처리종료");
		}
		
		
		
		
//		AppStart app = new AppStart();
//		try {
//			app.a();
//		} catch (Exception e) {
//			System.out.println("sdhad");
//		}
		
	}

}

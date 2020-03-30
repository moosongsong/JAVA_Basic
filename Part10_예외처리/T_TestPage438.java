package Part10Main;

import java.io.FileInputStream;
import java.io.IOException;

public class T_TestPage438 {
	
	public static int func() throws IOException {
		int a =10;
		int b=0;
		int value=0;
		FileInputStream fis = null;
		try {
			System.out.println("파일개방");
			System.out.println("파일사용");
			fis = new FileInputStream("data.txt");
			value = a/b;
		}
		catch (ArithmeticException ie) {
			// TODO: handle exception
			return -1;
//			value =-1;
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("file exception");
			throw e;//이렇게 중개를 할수도 있다.
			//throw new Exception //처럼 다른타입으로 보낼수도 있다.
		}
		finally {
			
			try {
				fis.close();//여기서도 예외가 발생할 수 있음.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("null excep");
			}
			System.out.println("파일 폐쇄");//마지막에 반드시 실행됨
		}
		
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=func();
//		System.out.println(a);
	}

}

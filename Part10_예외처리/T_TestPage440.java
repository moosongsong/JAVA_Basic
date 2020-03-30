package Part10Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T_TestPage440 {
	public static int method(int x, int y, int z) throws Exception{
		//처리를 한후 반환하는 값은 물체의 면적
		return 0;
		//나한테 이런 문제가 발생할 수 있으니까 너가 처리하렴.
		//이안에서 예외가 발생했을때, 어떻게 처리해야할 지 모른다면
		//throw를 이용해서 전가를 하는 것도 좋은 방법이다.
		//JVM이 관여만 하지 않으면 괜찮당
	}
	
	public static void fn() throws FileNotFoundException {
		FileInputStream fi = new FileInputStream ("data.txt");
	}
	
	public static void read() {
		try {
			fn();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("파일 찾기 실패");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("알수 없는 오류");
		}
		finally {
			System.out.println("end");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

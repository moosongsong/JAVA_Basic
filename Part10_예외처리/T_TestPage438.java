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
			System.out.println("���ϰ���");
			System.out.println("���ϻ��");
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
			throw e;//�̷��� �߰��� �Ҽ��� �ִ�.
			//throw new Exception //ó�� �ٸ�Ÿ������ �������� �ִ�.
		}
		finally {
			
			try {
				fis.close();//���⼭�� ���ܰ� �߻��� �� ����.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("null excep");
			}
			System.out.println("���� ���");//�������� �ݵ�� �����
		}
		
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=func();
//		System.out.println(a);
	}

}

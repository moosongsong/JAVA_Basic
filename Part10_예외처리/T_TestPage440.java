package Part10Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T_TestPage440 {
	public static int method(int x, int y, int z) throws Exception{
		//ó���� ���� ��ȯ�ϴ� ���� ��ü�� ����
		return 0;
		//������ �̷� ������ �߻��� �� �����ϱ� �ʰ� ó���Ϸ�.
		//�̾ȿ��� ���ܰ� �߻�������, ��� ó���ؾ��� �� �𸥴ٸ�
		//throw�� �̿��ؼ� ������ �ϴ� �͵� ���� ����̴�.
		//JVM�� ������ ���� ������ ������
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
			System.out.println("���� ã�� ����");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�˼� ���� ����");
		}
		finally {
			System.out.println("end");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

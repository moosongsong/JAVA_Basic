package Part4Main;
import java.util.*;
import java.io.*;
public class LetsUsingScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in); //System.in�� class�̴�. �빮�� �̴ϱ� Ŭ����.
//		
//		System.out.println("���� �޽��� ���");
//		System.err.println("�����޽��� ���"); //out �� err �� ������ �޶� ������ �ٲ� �� ����.
//		//Ŀ���� ���μ����� �����ϴ� ����� �ִ�.  log �޽��� ó���� ���Ǹ� ���� ��Ʈ���� �ΰ��� ����.
//		
//		System.out.println("���ڸ� �Է��ϼ���.");
//		int i= System.in.read();//
//		System.out.println("�ԷµȰ� "+ i);
//		
//		i= System.in.read();//
//		System.out.println("�ԷµȰ� "+ i);
//		i= System.in.read();//
//		System.out.println("�ԷµȰ� "+ i);
////		
//		System.out.print("�̸� :");
//		String str = sc.nextLine();//��������
//		System.out.print("���� :");
//		String str2 = sc.nextLine();
//		System.out.println(str);
//		System.out.println(str2);
		
		//Scanner col = new Scanner("ghd 10 10.1");
		Scanner col = new Scanner(new File("C:\\Users\\�۹���\\eclipse-workspace\\Practice_JAVA\\dfg.txt"));
		//C:\Users\�۹���\eclipse-workspace\Practice_JAVA
		String u1 = col.next();
		int u2 = col.nextInt();
		double u3 = col.nextDouble();
		
		System.out.println(u1+u2+u3);
		//sc.close();//������!!system.in�� ���� ���� ����.
		//err�� stack trace ���� ������� �ؿ� ���� ȣ���Ѵ�.
	}

}

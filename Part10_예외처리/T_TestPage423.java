package Part10Main;

public class T_TestPage423 {
	
	public static void funcA() throws Exception {
		throw new Exception("�׽�Ʈ����");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		funcA();//å�������� �ع���. �̽�������
		//���� �����߱⶧���� �ؿ� �ִ� sysout�� ������� �ʴ´�.
		System.out.println("���α׷��� �����մϴ�.");
		//main���� throws�� �ϴ� ���� JVM���� å���� �����Ѵ�.
		//JVM �� ���ܰ� �߻��� �����带 ���� ������ѹ�����.
		
		int a =10;
		int b=0;
		int c=a/b;//runtime exception ���⼭ ���ܰ� �ڵ����� ��������� ������.
		//ó�������� ������, JVM�� ������ �ϰ� �ȴ�. ���α׷� ���� ����...�̤̤̤�
		//exception�� �������� ���̾�
		System.out.println(c);
	}

}

package Part6Main;

//�޼ҵ� ȣ�� ����
class JUMsu{
	int point;//������ ������ 0���� �ʱ�ȭ
	
}

//call by reference

public class T_TestPage225_1 {
	static void f (JUMsu arg) {
		arg = new JUMsu();
		arg.point = 100;
	}
	static void f2 (JUMsu arg) {
		arg.point=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JUMsu j = new JUMsu();
		f(j);
		System.out.println(j.point);
		f2(j);
		System.out.println(j.point);
		
		String str = new String("ghdrlfehd");
		str="tlacjsdl";//���ڿ��� �ּҰ� �ٲ�� �ž�
		Integer i =1;
		i=2;//i�� ����Ű�� ��ü�� �ٲ�� �ž�, �ּҰ� �ٲ�� �ž�.
		// ��ü��ü�� �ٲٴ����� ���� ����! ���� ��ü�� �ٲٵ��� ����ؾ�.
	}

}

package Part3Main;

//class Sub{
	
//}

public class T_TestPage67 { //Ŭ���� ��ü, Ŭ���� ���Ǻ�(���� + ����)

	public static void main(String[] args) { //�޼ҵ� ��ü, �޼ҵ� ���Ǻ�(����, ����)
		// TODO Auto-generated method stub
		/*
		int ����;
		����=10;
		
		System.out.println("Second project : "+����);//������
		
		long a =2147483648L; //long �� ������ ��� 'L'
		float f = 3.14f;
		
		byte b = 10;
		//b = b +1L;
		b =(byte)(b+1L);
		*/
		
		/*//������ 67
		String name = "ȫ�浿";
		int age = 20;
		System.out.println("���ڿ��� ���� "+name.length());
		System.out.println(age);//��ü�� �ƴ� �Ϲݺ���
		*/
		
		//int ar[]= {10, 20, 30, 40};
		//System.out.println(ar[0]);
		
		
		/*
		boolean a =true;
		boolean b = false;
		
		System.out.println(a>b);//�� �Ұ�
		
		*/
		/*
		int a =10;
		int b =20;
		boolean c =a>b;
		
		boolean d =true;
		boolean g = false;
		boolean f= d!=g;  //�ǿ����ڴ� �����̶� ��ü���� ��� �����ϴ�.
		*/
		
		/*
		String name ="ȫ�浿";
		System.out.println(name instanceof String);
		*/
		
		/*
		Double od = 3.14;
		System.out.println(od instanceof Double);
		
		//page 93
		byte bb=1;
		bb=(byte)(bb<<8);//int byte�� ���־ ���� ĳ����
		System.out.println(bb);
		
		int cc = 1;
		cc=cc<<32;//0 or 1 �̱����� �����̱� ����
		//��ⷯ���� ������ 32%32=0 �ؼ� ������ �ȵȰ����� �ľ��� �� ����
		//�׷��ϱ� 31���Ϸ� ���� 
		System.out.println(cc);
		*/
		//page 100
		int a=10;
		int b=20;
		int c=30;
		
		//boolean result = a>b>c;
		//�̷��� �ϸ� �ȵȴ�.a, b�� ���� ���ϸ�  f�� ������ ������ �ڿ��� �� �Ұ��ϴ�
		boolean result = a>b || b>c;
		System.out.println(result);
		
		double d = a>b ? 30:400.0;//�����϶��� double���� �Ǿ�� �ϱ� ������ double ������ �����ؾ� �Ѵ�.
		System.out.println(d);
		
		//page 99
		int g = 10; //rv�� ����� ���
		int f = g; //Rv�� ������ ���
		int e = g+f;//Rv�� ������� ���
		int h = a*2+3;//Rv�� ���� ������� ���
		int i = func();
		
		
		byte bi = 10;
		//bi= bi + 100;//���������ڰ� �ƴϱ� ������ ĳ������ ���־�� �Ѵ�.
		bi +=100; //�ڱⰡ �˾Ƽ� ����ȯ�� �Ѵ�.
		//���������� ++ -- += �̷��� �ڵ� ����ȯ�� �ȴ�. 
		
	}
	static int func() {
		return 10;
	}
	
	//void sub();  //�������� �������� �߻�Ŭ�����̾�� �Ѵ�.

}
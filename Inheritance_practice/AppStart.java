
class A{
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
		// TODO Auto-generated constructor stub
	}
}

class C extends B{
	public C() {
		System.out.println("C");
		// TODO Auto-generated constructor stub
	}
}

public class AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s= new Student();
		//C c = new C();
//		 
//		Student s =new Student("ȫ�浿", "����");
//		//s.name = "ȫ�浿";//���� ��Ű������ ���� ����.
//		System.out.println(s);
		
		Person s =new Student("�л�", "����");//�ڵ� upcasting �Ǿ���.�ᱹ �ν��Ͻ� ������ ������� �׳�.
		
		System.out.println(s);
		s.show();
	}

}


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
//		Student s =new Student("홍길동", "전산");
//		//s.name = "홍길동";//같은 패키지여서 접근 가능.
//		System.out.println(s);
		
		Person s =new Student("학생", "전공");//자동 upcasting 되었다.결국 인스턴스 변수로 취급하자 그냥.
		
		System.out.println(s);
		s.show();
	}

}

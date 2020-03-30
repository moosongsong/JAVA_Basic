package Part3Main;

//class Sub{
	
//}

public class T_TestPage67 { //클래스 몸체, 클래스 정의부(선언 + 정의)

	public static void main(String[] args) { //메소드 몸체, 메소드 정의부(선언, 정의)
		// TODO Auto-generated method stub
		/*
		int 변수;
		변수=10;
		
		System.out.println("Second project : "+변수);//구현부
		
		long a =2147483648L; //long 형 값임을 명시 'L'
		float f = 3.14f;
		
		byte b = 10;
		//b = b +1L;
		b =(byte)(b+1L);
		*/
		
		/*//페이지 67
		String name = "홍길동";
		int age = 20;
		System.out.println("문자열의 길이 "+name.length());
		System.out.println(age);//객체가 아닌 일반변수
		*/
		
		//int ar[]= {10, 20, 30, 40};
		//System.out.println(ar[0]);
		
		
		/*
		boolean a =true;
		boolean b = false;
		
		System.out.println(a>b);//비교 불가
		
		*/
		/*
		int a =10;
		int b =20;
		boolean c =a>b;
		
		boolean d =true;
		boolean g = false;
		boolean f= d!=g;  //피연산자는 불형이랑 객체형도 사용 가능하다.
		*/
		
		/*
		String name ="홍길동";
		System.out.println(name instanceof String);
		*/
		
		/*
		Double od = 3.14;
		System.out.println(od instanceof Double);
		
		//page 93
		byte bb=1;
		bb=(byte)(bb<<8);//int byte로 못넣어서 강제 캐스팅
		System.out.println(bb);
		
		int cc = 1;
		cc=cc<<32;//0 or 1 미규정의 동작이기 때문
		//모듈러스로 했으면 32%32=0 해서 동작이 안된것으로 파악할 수 있음
		//그러니까 31이하로 쓰자 
		System.out.println(cc);
		*/
		//page 100
		int a=10;
		int b=20;
		int c=30;
		
		//boolean result = a>b>c;
		//이렇게 하면 안된다.a, b를 먼저 비교하면  f가 나오기 때문에 뒤에서 비교 불가하다
		boolean result = a>b || b>c;
		System.out.println(result);
		
		double d = a>b ? 30:400.0;//거짓일때는 double형이 되어야 하기 때문에 double 형으로 지정해야 한다.
		System.out.println(d);
		
		//page 99
		int g = 10; //rv에 상수식 사용
		int f = g; //Rv에 변수식 사용
		int e = g+f;//Rv에 연산식을 사용
		int h = a*2+3;//Rv에 복합 연산식을 사용
		int i = func();
		
		
		byte bi = 10;
		//bi= bi + 100;//배정연산자가 아니기 때문에 캐스팅을 해주어야 한다.
		bi +=100; //자기가 알아서 형변환을 한다.
		//배정연산자 ++ -- += 이런거 자동 형변환이 된다. 
		
	}
	static int func() {
		return 10;
	}
	
	//void sub();  //구현되지 않으려면 추상클래스이어야 한다.

}
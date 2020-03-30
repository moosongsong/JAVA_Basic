package Part10Main;

public class T_TestPage423 {
	
	public static void funcA() throws Exception {
		throw new Exception("테스트예외");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		funcA();//책임전가를 해버림. 이시점에서
		//강제 종료했기때문에 밑에 있는 sysout은 실행되지 않는다.
		System.out.println("프로그램을 종료합니다.");
		//main에서 throws를 하는 것은 JVM에게 책임을 전가한다.
		//JVM 는 예외가 발생한 쓰레드를 강제 종료시켜버린다.
		
		int a =10;
		int b=0;
		int c=a/b;//runtime exception 여기서 예외가 자동으로 만들어져서 던져짐.
		//처리구문이 없으면, JVM이 관여를 하게 된다. 프로그램 강제 종료...ㅜㅜㅜㅜ
		//exception은 던져지는 것이야
		System.out.println(c);
	}

}

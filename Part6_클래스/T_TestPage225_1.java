package Part6Main;

//메소드 호출 연습
class JUMsu{
	int point;//생성자 없으면 0으로 초기화
	
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
		str="tlacjsdl";//문자열의 주소가 바뀌는 거야
		Integer i =1;
		i=2;//i가 가리키는 객체가 바뀌는 거야, 주소가 바뀌는 거야.
		// 객체자체를 바꾸는짓은 하지 말자! 내용 자체를 바꾸도록 노력해야.
	}

}

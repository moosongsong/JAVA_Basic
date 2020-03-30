package Part5Main;
//열거형 추가 사용
enum Country{
	Korea("대한민국"), America("미국"), Canada("캐나다"), England("영국");
	private String name;
	
	private Country(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
}

public class T_TestAdd179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum 형은 new를 사용하지 않는다!
		Country c =Country.Korea;//이때 대입하는 순간 생성자가 호출이 되면서 인스턴스가 생성된다.
		System.out.println(c);//Korea
		System.out.println(c.getname());//대한민국
		c=Country.America;
		System.out.println(c);//America
		System.out.println(c.getname());//미국
	}

}

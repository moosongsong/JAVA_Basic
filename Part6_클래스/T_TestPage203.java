package Part6Main;
//생성자, get, set 연습
class Person{//193에도 person 있음
	private String name;
	private int gender;
	
	public Person() {
		this("홍길동", 20);
		System.out.println(".. comback");
	}
	public Person(String name){//생성자가 하나라도 있으면 기본 생성자는 제공되지 않는다.
		this(name, 20);
		System.out.println("name comeback");
	}
	public Person (String name, int gender) {
		System.out.println("name gender enter");
		this.name=name;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	public void showInfo() {
		System.out.println("name : "+name);
		System.out.println("gen : "+gender);
	}
}

public class T_TestPage203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.showInfo();
		p.setName("meme");
		p.setGender(2020);
		p.showInfo();
		String dd= p.getName();
		System.out.println(dd);
	}

}

package Part6Main;

class Person1 {
	private String name;
	private int gender;
	
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
}

public class T_TestPage193 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		Person p2 =new Person();
		p.setName("ȫ�浿");
		p.setGender(10);
		System.out.println(p);//��ü �ĺ��ڰ� ��µȴ�.Ÿ��+�ؽ��ڵ�
	}

}

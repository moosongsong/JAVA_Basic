package Part_6_Question;
//page 279~
class Member{
	private String name;
	private String id;
	private String passward;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Member() {
		this("","");
	}
	public Member(String name, String id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", passward=" + passward + ", age=" + age + "]";
	}
		
}

public class Q6_13_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		System.out.println(user1);
		System.out.println(user2);
	}

}

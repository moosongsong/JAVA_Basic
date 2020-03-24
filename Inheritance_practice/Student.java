
public class Student extends Person{
	private String major;
	public Student(String name, String major) {
		super(name);
		this.major = major;
		System.out.println("Student class constructor");
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		super.toString();
		return (super.toString())+"Student [name=" + name + "][major=" + major + "]";
	}
	public void show() {//becauseof final
		System.out.println("dd");
	}
	//public void showinfo() {
		
	//}
}

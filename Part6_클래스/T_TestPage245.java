package Part6Main;

//final practice, class student manager, total 2 classes

class Student{
	private String name;
	private int jumsu;
	private int rank;
	
	public Student(String name, int jumsu) {
		this.name = name;
		this.jumsu = jumsu;
		this.rank = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
//	public String toString() {
//		return (name+","+jumsu+","+rank);
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", jumsu=" + jumsu + ", rank=" + rank + "]";
	}
	
}

class Manager{
	private Student[] students;
	public final static int DEFAULT_COUNT = 0 ;//final�� �س��ұ⿡ ������ �ٲ� ������ ��� ���� ����
	//private final String managerName = "ȫ�浿";
	private final String managerName;//�ٲܼ� ����
	private int currentCount;
	
//	static {//static ��� �ʱ�ȭ ����
//		DEFAULT_COUNT=10;
//		func();//�̷� ������ static �Լ� ����ؾ�
//	}
//	
//	static void func() {
//		
//	}
	
	//setter
	public void setStudent(Student[] students) {
		this.students = students;
	}
	
	//getter
	public Student[] getStudent() {
		return students;
	}
	public static int getDefaultCount() {
		return DEFAULT_COUNT;
	}
	public String getManagerName() {
		return managerName;
	}

	//constructor
	public Manager() {
		this(DEFAULT_COUNT);
	}
	public Manager (int count) {
		this(count, "noname");
	}
	public Manager (int count, String name) {
		students = new Student[count];
		managerName = name;
		currentCount = 0;
	}
	
	public boolean addStudent(Student students) {
		if(currentCount < this.students.length) {
			this.students[currentCount++]=students;
			return true;
		}
		return false;
	}
	public Student find(String name) {
		//�˻��Ͽ� ��ȯ
		//Student student = null;
		//Student ��ü�� ã�Ƽ� student�� ����
		for (int i = 0; i < currentCount; i++) {
			if(students[i].getName().equals(name)){
				return students[i];
			}
		}
		return null;
	}
	public void showList() {
		for (int i = 0; i < currentCount; i++) {
			System.out.println(students[i]);
		}
	}
}

public class T_TestPage245 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manager.DEFAULT_COUNT=100;//error, because of 'final'
		
//		final int a =10;
//		a=0;//error, this is final
		Manager manager = new Manager(3, "sim");
		manager.addStudent(new Student("eds", 100));
		manager.addStudent(new Student("abc", 10));
		manager.addStudent(new Student("ddd", 800));
		
		Student find = manager.find("ddd");
		if(find!=null) {
			System.out.println(find);
		}
		else {
			System.out.println("�˻� ����");
		}
		manager.showList();
	}

}

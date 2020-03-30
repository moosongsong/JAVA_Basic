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
	public final static int DEFAULT_COUNT = 0 ;//final로 해놓았기에 정보가 바뀔 이유가 없어서 공개 노상관
	//private final String managerName = "홍길동";
	private final String managerName;//바꿀수 없음
	private int currentCount;
	
//	static {//static 멤버 초기화 목적
//		DEFAULT_COUNT=10;
//		func();//이런 식으로 static 함수 사용해야
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
		//검색하여 반환
		//Student student = null;
		//Student 객체를 찾아서 student에 대입
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
			System.out.println("검색 실패");
		}
		manager.showList();
	}

}

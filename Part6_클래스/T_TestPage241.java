package Part6Main;
//static practice
class Car{
	private static int count=0;
	private String name;
	//public int mCount;
	public static int getCount() {
		return count;
	}
	
	public Car() {
		this("sonata");
		count++;
		//mCount++;
	}
	
	public Car(String name) {
		this.name=name;
	}

	public static void setCount(int count) {
		Car.count = count;
	}
	
	public static void increment() {
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return ("kind of car : "+name);
	}
}

public class T_TestPage241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c1 = new Car();
//		Car c2 = new Car();
//		Car c3 = new Car();
//		System.out.println(c1.mCount);
//		System.out.println(c2.mCount);
//		System.out.println(c3.mCount);
//		System.out.println(Car.getCount());
		//System.out.println(c1.getCount());//c1의 타입을 확인해서 클래스를 찾아서 컴파일러가 돌린다.
		//따라서 클래스 멤버는 클래스 이름으로 접근하자
		System.out.println("");
		System.out.println("<Integer확인하기>");
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("");
		System.out.println("add soming");
		int num = Integer.parseInt("123");
		System.out.println(num);
		int num2 = Integer.parseInt("A", 16);
		System.out.println(num2);
		System.out.println(Integer.toBinaryString(num2));
	}
	
}

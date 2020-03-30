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
		//System.out.println(c1.getCount());//c1�� Ÿ���� Ȯ���ؼ� Ŭ������ ã�Ƽ� �����Ϸ��� ������.
		//���� Ŭ���� ����� Ŭ���� �̸����� ��������
		System.out.println("");
		System.out.println("<IntegerȮ���ϱ�>");
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

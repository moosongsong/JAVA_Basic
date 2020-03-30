package Interface_Practice;

public class Duck implements Flyable{

	@Override
	public void fly() {
		System.out.println("오리, 하늘을 날다");
	}
	
	public void run() {
		System.out.println("오리, 달리다");
	}
//	public abstract void fly(); // 가 이렇게 되어있는 상태라고 볼 수 있다.
}

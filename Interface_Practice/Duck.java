package Interface_Practice;

public class Duck implements Flyable{

	@Override
	public void fly() {
		System.out.println("����, �ϴ��� ����");
	}
	
	public void run() {
		System.out.println("����, �޸���");
	}
//	public abstract void fly(); // �� �̷��� �Ǿ��ִ� ���¶�� �� �� �ִ�.
}

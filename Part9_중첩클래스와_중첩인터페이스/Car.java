package Part9Main;

public class Car {
	public final static String TYPE = "�ڵ���";
	private String name;
	
	public Car(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		Engine e =new Engine(3000);
		e.on();
	}
	
	interface Runnable {
		public abstract void run();//�ڵ����� ������� ����. ���� ���ǰ� ���� �ʱ� ������
	}
	
	
	static class Engine{//�ȿ����� ���ڴ� ��� �ǹ��̴�.
		public static final String ENGINE_TYPE="�ѽ����̽� ����";
		private int displacement;
		
		public Engine(int displacement) {
			// TODO Auto-generated constructor stub
			this.displacement=displacement;
		}
		
		public int getDisplacement() {
			return displacement;
		}
		
		public void setDisplacement(int displacement) {
			this.displacement = displacement;
		}
		
		public void on() {
			System.out.println(Car.TYPE);
//			System.out.println(Car.this.name+"�� "+ENGINE_TYPE+"�� �����մϴ�.");
			System.out.println("��ⷮ�� "+this.displacement);//displacement���� ����
		}
	}
}

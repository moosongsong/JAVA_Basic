package Part9Main;

public class Car {
	public final static String TYPE = "자동차";
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
		public abstract void run();//자동차는 사용하지 못함. 먼저 정의가 되지 않기 때문에
	}
	
	
	static class Engine{//안에서만 쓰겠다 라는 의미이다.
		public static final String ENGINE_TYPE="롤스로이스 마린";
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
//			System.out.println(Car.this.name+"의 "+ENGINE_TYPE+"을 구동합니다.");
			System.out.println("배기량은 "+this.displacement);//displacement생략 가능
		}
	}
}

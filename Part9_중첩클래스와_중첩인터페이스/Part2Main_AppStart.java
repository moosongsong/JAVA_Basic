package Part9Main;

class Bike implements Car.Runnable{

	@Override
	public void run() {
	
	}
}

public class Part2Main_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c =new Car("Hyundai");
		c.showInfo();
		
		Car c2 = new Car("º¥Ã÷");
		c2.showInfo();
		
//		Car.Engine e =c.new Engine(5000);
		
//		e.on();
		
//		Car.Engine e2 = c.new Engine(2000);
//		e2.on();
		
		Car.Engine e =new Car.Engine(2000);
		Car.Engine e2 =new Car.Engine(6000);
		e.on();
		e2.on();
		System.out.println(Car.Engine.ENGINE_TYPE);
		c.showInfo();
	}

}


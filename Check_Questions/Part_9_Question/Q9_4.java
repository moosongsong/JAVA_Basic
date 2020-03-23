package Part_9_Question;

class Car{
	class Tire{
		
	}
	static class Engine{
		
	}
}

public class Q9_4 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}
}

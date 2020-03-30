package Part10Main.사용자정의예외;

public class Car_AppStart {

	public static void main(String[] args){
		
		Car car = new Car(10, false);
		car.setEnginestopex(new EngineStopException());
		car.setNotexcep(new NotEnoughFuelException());
		
		car.run(150);
		
	}
}

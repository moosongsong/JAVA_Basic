package Part10Main.사용자정의예외;

public class NotEnoughFuelException extends CarException{
	private final static String MESSAGE = "연료부족";
	
	public NotEnoughFuelException() {
		super(MESSAGE);
	}
	
	@Override
	public void doException(Car car) {
		System.out.println("연료추가");
		car.setFuel(100);
		System.out.println("주유후 주행");
	}
}
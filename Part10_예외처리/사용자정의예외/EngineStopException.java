package Part10Main.사용자정의예외;

public class EngineStopException extends CarException{
	private final static String MESSAGE ="엔진 정지";
	
	public EngineStopException() {
		super(MESSAGE);
	}
	
	@Override
	public void doException(Car car) {
		System.out.println("엔진을 점검합니다.");
		car.setEngineOn();
	}
}
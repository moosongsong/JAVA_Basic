package Part10Main.��������ǿ���;

public class EngineStopException extends CarException{
	private final static String MESSAGE ="���� ����";
	
	public EngineStopException() {
		super(MESSAGE);
	}
	
	@Override
	public void doException(Car car) {
		System.out.println("������ �����մϴ�.");
		car.setEngineOn();
	}
}
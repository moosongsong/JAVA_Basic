package Part10Main.��������ǿ���;

public class NotEnoughFuelException extends CarException{
	private final static String MESSAGE = "�������";
	
	public NotEnoughFuelException() {
		super(MESSAGE);
	}
	
	@Override
	public void doException(Car car) {
		System.out.println("�����߰�");
		car.setFuel(100);
		System.out.println("������ ����");
	}
}
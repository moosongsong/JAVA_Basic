package Part10Main.��������ǿ���;

public abstract class CarException extends Exception{

		public CarException() {
		}
		
		public CarException(String msg) {
			super(msg);
		}
		
		public abstract void doException(Car car) ;
}

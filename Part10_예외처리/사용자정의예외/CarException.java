package Part10Main.사용자정의예외;

public abstract class CarException extends Exception{

		public CarException() {
		}
		
		public CarException(String msg) {
			super(msg);
		}
		
		public abstract void doException(Car car) ;
}

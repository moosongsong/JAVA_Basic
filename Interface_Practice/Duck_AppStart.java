package Interface_Practice;

public class Duck_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable dd = new Duck();
		Runnable rr = new Duck();
		dd.fly();
		
		if(rr instanceof Flyable) {
			((Flyable)rr).fly();
		}
	}
}

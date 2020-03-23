package Part_8_Question;

interface Soundable{
	String sound();
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "�߿�";
	}
}

class Dog implements Soundable{
	@Override
	public String sound() {
		return "�۸�";
	}
}

public class Q8_3 {
	private static void printSound(Soundable sd) {
		System.out.println(sd.sound());
	}
	
	public static void main(String [] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

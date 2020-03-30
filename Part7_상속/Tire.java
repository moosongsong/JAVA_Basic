package Part7Main;

public class Tire {
	public int maxRotation;
	public int accumulatdRotation;
	public String location;
	
	public Tire (String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	public boolean roll() {
		++accumulatdRotation;
		if(accumulatdRotation<maxRotation) {
			System.out.println(location + "Tire ����: "+(maxRotation-accumulatdRotation)+"ȸ");
			return true;
		}
		else {
			System.out.println("*** "+location+"Tire ��ũ***");
			return false;
		}
	}
}

package Part7Main;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatdRotation;
		
		if(accumulatdRotation<maxRotation) {
			System.out.println(location+" 금호타이어 수명:"+(maxRotation=accumulatdRotation));
			return true;
		}
		else {
			System.out.println("*** "+location +"금호타이어 펑크 ***");
			return false;
		}
	}
	
	
}

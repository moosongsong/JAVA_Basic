package Part7Main;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		//return super.roll();
		++accumulatdRotation;
		
		if(accumulatdRotation<maxRotation) {
			System.out.println(location+" 한국타이어 수명:"+(maxRotation=accumulatdRotation));
			return true;
		}
		else {
			System.out.println("*** "+location +"한국타이어 펑크 ***");
			return false;
		}
	}
}

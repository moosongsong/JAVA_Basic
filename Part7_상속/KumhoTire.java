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
			System.out.println(location+" ��ȣŸ�̾� ����:"+(maxRotation=accumulatdRotation));
			return true;
		}
		else {
			System.out.println("*** "+location +"��ȣŸ�̾� ��ũ ***");
			return false;
		}
	}
	
	
}

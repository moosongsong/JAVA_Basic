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
			System.out.println(location+" �ѱ�Ÿ�̾� ����:"+(maxRotation=accumulatdRotation));
			return true;
		}
		else {
			System.out.println("*** "+location +"�ѱ�Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}

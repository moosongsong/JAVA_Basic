package Part7Main;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�ڿ�����", 17);
				break;
			default:
				break;
			}
			System.out.println("------------------------------------------");
		}
	}
}

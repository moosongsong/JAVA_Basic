package Part_3_Question;

public class Q3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x =5.0;
		double y =0.0;
		double z =x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		}
		else {
			double result = z+10;
			System.out.println("���: "+result);
		}
		
		System.out.println();
	}

}

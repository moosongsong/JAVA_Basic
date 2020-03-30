package Part4Main;

public class T_TestPage131_132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugu: for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
				if((i==5)&&(j==5)) {
					break gugu;
				}
			}
		}
	}

}

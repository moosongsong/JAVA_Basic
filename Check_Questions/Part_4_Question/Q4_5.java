package Part_4_Question;

public class Q4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=60;
		int xcount = 60/4;
		int ycount = 60/5;
		
		int total =0;
		
		for (int i = 0; i < xcount; i++) {
			for (int j = 0; j < ycount; j++) {
				if((i*4+j*5)==60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}

}

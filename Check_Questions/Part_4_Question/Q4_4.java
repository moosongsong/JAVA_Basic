package Part_4_Question;

public class Q4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		do {
			a=(int) (Math.random()*6+1);
			b=(int) (Math.random()*6+1);
			System.out.println("("+a+","+b+")");
		}while((a+b)!=5);
	}

}

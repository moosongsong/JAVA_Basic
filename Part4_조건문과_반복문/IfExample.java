package Part4Main;
//20200310 화

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		if(a!=0) { //boolean 값이어야 함.
			System.out.println("a is not 0.");
		}
		///////////////////////////////////////////////
		boolean flag = true;
		if (flag) {
			System.out.println("flag is "+flag);
		}
		//////////////////This is Practice/////////////////////////////
		int score = 93;
		
		if(score>=90) {
			System.out.println("score is higher than 90");
			System.out.println("The grade is A");
		}
		
		if(score<90)
			System.out.println("score is lower than 90");
		System.out.println("The grade is B");//this line is no relation with 'if'
	}

}

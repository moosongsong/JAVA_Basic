package Part5Main;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {83,90,87};
		System.out.println("score[0]"+score[0]);
		System.out.println("score[1]"+score[1]);
		System.out.println("score[2]"+score[2]);
		
		int sum =0;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		
		System.out.println("����:"+sum);
	}

}

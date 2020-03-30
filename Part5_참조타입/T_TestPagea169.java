package Part5Main;

public class T_TestPagea169 {
	//static int count =0;
	static void func(int num, int mum) {//instance member
		
		if(num>mum) {
			return;
		}
		else {
			System.out.println(num);
			func(num+1, mum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] ar=new int [][] {{1,2,3},{4,5},{6,7,8,9}};
//		for (int[] is : ar) {
//			for (int is2 : is) {
//				System.out.println(is2);
//			}
//		}
		
		//1부처 10까지 출력하는 프로그램을 작성하시오 (재귀호출 이용해야)
		func(1,10);//호출 가능
		//System.out.println(count);
		
		
		//배열이 하나 주어질때 -1 을 만날때까지 출력하는 프로그램을 작성하세요.
		
		int[]ar= {5,4,6,7,-3,-1,-9,10,4};
		findminus(ar, 0, -1);
		
	}
	
	static void findminus(int [] ar,int n, int temp) {
		if(n>=ar.length) {
			System.out.println("검색실패");
			return;
		}
		else if(ar[n]== temp){
			return;
		}
		System.out.println(ar[n]);
		findminus(ar,n+1, temp);
	}
}
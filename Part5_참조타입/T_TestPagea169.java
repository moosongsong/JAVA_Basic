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
		
		//1��ó 10���� ����ϴ� ���α׷��� �ۼ��Ͻÿ� (���ȣ�� �̿��ؾ�)
		func(1,10);//ȣ�� ����
		//System.out.println(count);
		
		
		//�迭�� �ϳ� �־����� -1 �� ���������� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		int[]ar= {5,4,6,7,-3,-1,-9,10,4};
		findminus(ar, 0, -1);
		
	}
	
	static void findminus(int [] ar,int n, int temp) {
		if(n>=ar.length) {
			System.out.println("�˻�����");
			return;
		}
		else if(ar[n]== temp){
			return;
		}
		System.out.println(ar[n]);
		findminus(ar,n+1, temp);
	}
}
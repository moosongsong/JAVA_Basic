package Part11Main.Wrapper;

import java.util.Random;

public class MathRandom_Test {
	
	public static void func (int num) {
		int ary1[]=new int [num+1];
		int ary2[]=new int [num+1];
		Random rd = new Random();
//		
//		for (int i = 1; i <= num; i++) {
////			int temp=(int) ((Math.random()*num)+1);
//			int temp=(int) (rd.nextInt(num)+1);
//			if(ary2[temp]==0) {
//				ary1[i]=temp;
//				ary2[temp]=20;
//			}
//			else {
//				i--;
//			}
//		}
//		
//		int i=1;
//		while (i<=num) {
//			int temp=(int) ((Math.random()*num)+1);
////			int temp=(int) (rd.nextInt(num)+1);
//			if(ary2[temp]==0) {
//				ary1[i]=temp;
//				ary2[temp]=20;
//			}
//			else {
//				i--;
//			}
//		}
//		
		
		for (int i = 0; i < ary2.length; i++) {
			ary2[i]=i+1;
		}
		
		for (int j = 0; j < ary2.length; j++) {
			int r = rd.nextInt(num);
			int temp=ary2[0];
			ary2[0]=ary2[r];
			ary2[r]=temp;
		}
		
		
		for (int j = 1; j <= num; j++) {
			System.out.println(j+":"+ary2[j]);
		}
	}
	

	public static void main(String[] args) {
		func(10);
	}

}

package Part3Main;

import java.awt.image.DataBufferDouble;

public class T_TestPage83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 10; int b =0; if(b==0) {
		 * 
		 * }else { int c = a/b; }
		 */
		/*
		double a = 10/0.0;
		double b= 10/0.0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		*/
		//page 84
		/*
		Double c = new Double("NaN");
		Double d = new Double("Infinity");
		System.out.println(c);
		System.out.println(d);
		System.out.println(c*10);
		System.out.println(d*10);
		System.out.println(Double.isNaN(c));
		System.out.println(Double.isInfinite(d));
		*/
		//
		
		Double c = Math.sqrt(-100.0);
		System.out.println("cÀÇ °ªÀº:"+c);
		
		int a =10;
		int b =20;
		System.out.println("adhk al "+a+b);
		System.out.println("adhk al "+(a+b));
		
		String str = ""+a;
		String str2= ""+b;
		System.out.println(str + str2);
		
		String s1 = new String("È«±æµ¿");
		String s2 = new String("È«±æµ¿");
		String s3 = "È«±æµ¿";
		String s4 = "È«±æµ¿";
		System.out.println(s3==s4);
	}

}

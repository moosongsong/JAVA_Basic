package Part4Main;
import java.util.*;
public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int ko, en, ma;
		
		System.out.println("국어 점수:");
		ko=sc.nextInt();
		System.out.println("영어 점수: ");
		en=sc.nextInt();
		System.out.println("수학 점수:");
		ma=sc.nextInt();
		
		System.out.println(ko+" "+en+ " "+ma);
		System.out.printf("%4d%4d%4d%6.2lf", ko, en, ma, (double)(((double)(ko+en+ma))/3.0));
	}

}

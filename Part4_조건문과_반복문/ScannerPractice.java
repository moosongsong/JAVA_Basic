package Part4Main;
import java.util.*;
public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int ko, en, ma;
		
		System.out.println("���� ����:");
		ko=sc.nextInt();
		System.out.println("���� ����: ");
		en=sc.nextInt();
		System.out.println("���� ����:");
		ma=sc.nextInt();
		
		System.out.println(ko+" "+en+ " "+ma);
		System.out.printf("%4d%4d%4d%6.2lf", ko, en, ma, (double)(((double)(ko+en+ma))/3.0));
	}

}

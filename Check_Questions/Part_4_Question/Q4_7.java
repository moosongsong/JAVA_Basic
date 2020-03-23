package Part_4_Question;

import java.util.Scanner;

public class Q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		int selectNo=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			selectNo = sc.nextInt();
			switch (selectNo) {
			case 1:
				System.out.print("예금액>");
				selectNo = sc.nextInt();
				balance+=selectNo;
				break;
			case 2:
				System.out.print("출금액>");
				selectNo = sc.nextInt();
				balance-=selectNo;
				break;
			case 3:
				System.out.println("잔고>"+balance);
				break;
			case 4:
				run=false;
				break;
			default:
				System.out.println("재선택하시오.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}

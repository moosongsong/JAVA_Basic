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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			
			selectNo = sc.nextInt();
			switch (selectNo) {
			case 1:
				System.out.print("���ݾ�>");
				selectNo = sc.nextInt();
				balance+=selectNo;
				break;
			case 2:
				System.out.print("��ݾ�>");
				selectNo = sc.nextInt();
				balance-=selectNo;
				break;
			case 3:
				System.out.println("�ܰ�>"+balance);
				break;
			case 4:
				run=false;
				break;
			default:
				System.out.println("�缱���Ͻÿ�.");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}

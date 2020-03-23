package Part_6_Question;

import java.util.Scanner;

class Account2{
	private String ano;
	private String owner;
	private int balance;
	
	public Account2(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class Q6_20 {
	private static Account2 [] accountary=new Account2[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			else if (selectNo == 2) {
				accountList();
			}
			else if (selectNo == 3) {
				deposit();
			}
			else if (selectNo == 4) {
				withdraw();
			}
			else if (selectNo == 5) {
				run = false;
			}
			else {
				System.out.println("fail");
			}
		}
		System.out.println("프로그램 종료");
		
	}
	private static void createAccount() {
		int totalNum=0;
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		String anotemp;
		String ownertemp;
		int balancetemp=0;
		
		while(true) {
			if(accountary[totalNum]==null) {
				System.out.print("계좌번호:");
				anotemp = sc.next();
				System.out.print("계좌주:");
				ownertemp=sc.next();
				System.out.print("초기입금액:");
				balancetemp=sc.nextInt();
				System.out.println("결과 : 계좌가 생성되었습니다.");
				accountary[totalNum]=new Account2(anotemp, ownertemp, balancetemp);
				break;
			}
			totalNum++;
		}
		
		
	}
	private static void accountList() {
		int i=0;
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		while(true) {
			if(accountary[i]==null) {
				break;
			}
			else {
				System.out.println(accountary[i].getAno()+"   "+accountary[i].getOwner()+"   "+accountary[i].getBalance());;
			}
			i++;
		}
	}
	private static void deposit() {
		String anotemp;
		int money;
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호:");
		anotemp = sc.next();
		System.out.print("예금액:");
		money=sc.nextInt();
		
		Account2 dep = findAccount(anotemp);
		
		if(dep==null) {
			System.out.println("입금실패");
		}
		else {
			dep.setBalance(dep.getBalance()+money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
				
	}
	private static void withdraw() {
		String anotemp;
		int money;
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호:");
		anotemp = sc.next();
		System.out.print("출금액:");
		money=sc.nextInt();
		
		Account2 dep = findAccount(anotemp);
		
		if(dep==null) {
			System.out.println("출금실패");
		}
		else {
			dep.setBalance(dep.getBalance()-money);
			System.out.println("결과: 출금이 성공되었습니다.");
		}
	}
	private static Account2 findAccount(String ano) {
		//Account2 p =new Account2(null, null, 0);
		int i=0;
		while(true) {
			if(accountary[i]==null) {
				break;
			}
			else if(accountary[i].getAno().equals(ano)) {
				return accountary[i];
			}
			else {
				i++;
			}
		}
		return null;
	}
}

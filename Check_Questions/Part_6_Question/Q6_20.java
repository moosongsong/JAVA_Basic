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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����>");
			
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
		System.out.println("���α׷� ����");
		
	}
	private static void createAccount() {
		int totalNum=0;
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		String anotemp;
		String ownertemp;
		int balancetemp=0;
		
		while(true) {
			if(accountary[totalNum]==null) {
				System.out.print("���¹�ȣ:");
				anotemp = sc.next();
				System.out.print("������:");
				ownertemp=sc.next();
				System.out.print("�ʱ��Աݾ�:");
				balancetemp=sc.nextInt();
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				accountary[totalNum]=new Account2(anotemp, ownertemp, balancetemp);
				break;
			}
			totalNum++;
		}
		
		
	}
	private static void accountList() {
		int i=0;
		System.out.println("--------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("--------");
		
		System.out.print("���¹�ȣ:");
		anotemp = sc.next();
		System.out.print("���ݾ�:");
		money=sc.nextInt();
		
		Account2 dep = findAccount(anotemp);
		
		if(dep==null) {
			System.out.println("�Աݽ���");
		}
		else {
			dep.setBalance(dep.getBalance()+money);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
		}
				
	}
	private static void withdraw() {
		String anotemp;
		int money;
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		
		System.out.print("���¹�ȣ:");
		anotemp = sc.next();
		System.out.print("��ݾ�:");
		money=sc.nextInt();
		
		Account2 dep = findAccount(anotemp);
		
		if(dep==null) {
			System.out.println("��ݽ���");
		}
		else {
			dep.setBalance(dep.getBalance()-money);
			System.out.println("���: ����� �����Ǿ����ϴ�.");
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

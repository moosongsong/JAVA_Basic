package Part_6_Question;

class Account{
	private int balance;
	public static final int MIN_BALANCE=0;
	public static final int MAX_BALANCE=1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;
		}	
	}
}

public class Q6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
	}

}

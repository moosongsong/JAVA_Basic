package Part_10_Question;

class NotExistIDException extends Exception{
	public NotExistIDException() {
		;
	}
	public NotExistIDException(String msg) {
		super(msg);
	}
	
}

class WrongPasswordException extends Exception{
	public WrongPasswordException() {
		;
	}
	public WrongPasswordException(String msg) {
		super(msg);
	}
}

public class Q10_7 {
	
	public static void login(String id, String passwd) throws NotExistIDException, WrongPasswordException {//
		if(id.equals("blue")==false) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		
		if(passwd.equals("12345")==false) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "125");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

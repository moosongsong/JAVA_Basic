package Part_6_Question;

class MemberService{
	private String id;
	private String passWord;
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}

public class Q6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}

package Part5Main;

public class StringEquelsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("1과2 참조가 같다.");
		}
		else {
			System.out.println("1과 2 참조가 다르다.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("1과 2 문자열이 같다.");
		}
		else {
			;
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if (strVar3==strVar4) {
			System.out.println("3과 4 참조가 같다.");
		}
		else {
			System.out.println("3과 4 참조가 다르다.");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("3과 4 문자열이 같다.");
		}
		else {
			;
		}
	}

}

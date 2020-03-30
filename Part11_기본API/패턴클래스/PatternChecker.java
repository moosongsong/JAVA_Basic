package Part11Main.패턴클래스;

import java.util.regex.Pattern;

public class PatternChecker {
	private static String phoneRegex = "\\d{2,3}-\\d{3,4}-\\d{4}";
	private static String emailRegex = "[a-z][\\w_]*@\\w+\\.\\w+(\\.\\w+)?";
//	private static String emailRegex2 = "[a-z][\\w_]*@\\
	public static String getPhoneRegex() {
		return phoneRegex;
	}

	public static String getEmailRegex() {
		return emailRegex;
	}

	public static void setPhoneRegex(String phoneRegex) {
		PatternChecker.phoneRegex = phoneRegex;
	}

	public static void setEmailRegex(String emailRegex) {
		PatternChecker.emailRegex = emailRegex;
	}

	public static boolean checkPhoneNumber(String phoneNumber) {
		return Pattern.matches(phoneRegex, phoneNumber);
	}
	
	public static boolean checkEmail(String email) {
		return Pattern.matches(emailRegex, email);
		
	}
}

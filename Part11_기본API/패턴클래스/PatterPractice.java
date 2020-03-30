package Part11Main.패턴클래스;

import java.util.regex.Pattern;

public class PatterPractice {

	public static void main(String[] args) {
		String regex="[a-z][\\w_]*@\\w+\\.\\w+(\\.\\w+)?";
		boolean result = Pattern.matches(regex, "songe08@gmail.com");
		if(result==true) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
		
		if(PatternChecker.checkEmail("songe08@gmail.com")) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
	}

}

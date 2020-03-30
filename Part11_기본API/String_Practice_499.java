package Part11Main;

public class String_Practice_499 {
	
	
	public static int func(String str) {
		int result=0;
		
		for (int i = 0; i < str.length(); i++) {
			result=result*10;
			result=result + str.charAt(i)-'0';
		}
		return result;
	}
	
	public static boolean name(String [] works, String str) {
		if(str.length()==0) {
			return true;
		}
		else {
			for (int i = 0; i < works.length; i++) {
				if(str.startsWith(works[i])==true) {
					return name(works,str.substring(works[i].length()));
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(func("1234"));
		
		String[] works= {"World", "Java", "Hello"};
		String str1 = "HelloJavaWorld";
		String str2 = "GoodJavaWorld";
		
		if(name(works, str1)) {
			System.out.println("Good");
		}
		else {
			System.out.println("Noot Good");
		}
		
		if(name(works, str2)) {
			System.out.println("Good");
		}
		else {
			System.out.println("Noot Good");
		}
		
	}

}

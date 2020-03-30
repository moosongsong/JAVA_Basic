package Part11Main.arrayTest;

import java.util.Arrays;

public class Person_AppStart {

	public static void main(String[] args) {
		Person []pers=new Person[] {
				new Person ("meme", 100, 100),
				new Person ("mimi", 50, 50),
				new Person("gogo", 60, 60)
		};
		
		
		Arrays.sort(pers);
		
		for (int i = 0; i < pers.length; i++) {
			System.out.println(pers[i]);
		}
	}

}

package Part11Main;

import java.util.Comparator;
import java.util.Objects;


public class Comparator_Test_AppStart {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c =Objects.compare(a, b, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1-o2);
			}
			
		});
		
		System.out.println(c);
	}

}

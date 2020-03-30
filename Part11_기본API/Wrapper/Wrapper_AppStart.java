package Part11Main.Wrapper;

public class Wrapper_AppStart {
	
	public static void fun(Integer i) {
		i=200;
	}

	public static void main(String[] args) {
		Integer a =100;
		fun(a);
		System.out.println(a);
		
		Integer[]ar= {10,20,30};
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=ar[i]+1;
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j]);
		}
	}

}

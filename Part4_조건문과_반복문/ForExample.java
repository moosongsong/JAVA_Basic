package Part4Main;

//page 123
public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			if (ar[i] == 5) {
				break;
			}
		}

		boolean flag = true;
		for (int i = 0; i < ar.length && flag; i++) {
			System.out.println(ar[i]);
			if (ar[i] == 5) {
				flag = false;
			}
		}
	}

}

package Part5Main;

enum Week{
	Mon, Tue, Wed, Thu, Fri, Sat, Sun
}

public class T_TestPage178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.Wed;
		Week nextday = Week.valueOf("Wed");
		Week[] ar = Week.values();
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i].name());
			System.out.println(ar[i].ordinal());
		}
	}

}

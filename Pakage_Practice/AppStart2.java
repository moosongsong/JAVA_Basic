import my.lang.City;
import my.lang.Subject;
public class AppStart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c =City.BUSAN;
		int num = Subject.KOR;
		
		System.out.println(c.getDistance());
		System.out.println(c.compareTo(City.JEJU));
		System.out.println(num);//아이고 숫자가 나와버리네
		
	}
	
}

package Part11Main.패턴클래스;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpletFormat_AppStart {

	public static void main(String[] args) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy, MM, dd, HH, ss");
		String date = sdf.format(cal.getTime());	
		System.out.println(date);
		
		
		for (int i = 0; i < 10; i++) {
			cal = Calendar.getInstance();
			String dat2e = sdf.format(cal.getTime());
			System.out.println(dat2e);
			Thread.sleep(1000);
		}
	}

}

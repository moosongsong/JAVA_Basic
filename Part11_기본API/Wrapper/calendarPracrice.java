package Part11Main.Wrapper;

import java.util.Calendar;

public class calendarPracrice {
	public static void main(String [] args) {
		Calendar cal = Calendar.getInstance();
		
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR)).append("년").append(cal.get(Calendar.MONTH)+1).append("월")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("일").append(cal.get(Calendar.HOUR)).append("시")
		.append(cal.get(Calendar.MINUTE)).append("분").append(cal.get(Calendar.SECOND)).append("초");
		
		System.out.println(sb);
		
//		cal.set(Calendar.HOUR, Calendar.HOUR+500);
//		
//		sb=new StringBuilder();
//		sb.append(cal.get(Calendar.YEAR)).append("년").append(cal.get(Calendar.MONTH)+1).append("월")
//		.append(cal.get(Calendar.DAY_OF_MONTH)).append("일").append(cal.get(Calendar.HOUR)).append("시")
//		.append(cal.get(Calendar.MINUTE)).append("분").append(cal.get(Calendar.SECOND)).append("초");
//		
//		System.out.println(sb);
		
		cal.set(Calendar.DATE, Calendar.DATE+157);
		
		sb=new StringBuilder();
		sb.append(cal.get(Calendar.YEAR)).append("년").append(cal.get(Calendar.MONTH)+1).append("월")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("일").append(cal.get(Calendar.HOUR)).append("시")
		.append(cal.get(Calendar.MINUTE)).append("분").append(cal.get(Calendar.SECOND)).append("초");
		
		System.out.println(sb);
	}
}

package Part11Main.Wrapper;

import java.util.Calendar;

public class calendarPracrice {
	public static void main(String [] args) {
		Calendar cal = Calendar.getInstance();
		
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR)).append("��").append(cal.get(Calendar.MONTH)+1).append("��")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("��").append(cal.get(Calendar.HOUR)).append("��")
		.append(cal.get(Calendar.MINUTE)).append("��").append(cal.get(Calendar.SECOND)).append("��");
		
		System.out.println(sb);
		
//		cal.set(Calendar.HOUR, Calendar.HOUR+500);
//		
//		sb=new StringBuilder();
//		sb.append(cal.get(Calendar.YEAR)).append("��").append(cal.get(Calendar.MONTH)+1).append("��")
//		.append(cal.get(Calendar.DAY_OF_MONTH)).append("��").append(cal.get(Calendar.HOUR)).append("��")
//		.append(cal.get(Calendar.MINUTE)).append("��").append(cal.get(Calendar.SECOND)).append("��");
//		
//		System.out.println(sb);
		
		cal.set(Calendar.DATE, Calendar.DATE+157);
		
		sb=new StringBuilder();
		sb.append(cal.get(Calendar.YEAR)).append("��").append(cal.get(Calendar.MONTH)+1).append("��")
		.append(cal.get(Calendar.DAY_OF_MONTH)).append("��").append(cal.get(Calendar.HOUR)).append("��")
		.append(cal.get(Calendar.MINUTE)).append("��").append(cal.get(Calendar.SECOND)).append("��");
		
		System.out.println(sb);
	}
}

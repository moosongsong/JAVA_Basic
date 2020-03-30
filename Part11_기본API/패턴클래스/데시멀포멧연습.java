package Part11Main.패턴클래스;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class 데시멀포멧연습 {

	public static void main(String[] args) {
		int money = 10000000;
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(money));
		
		double dd = 3.1415926;
		DecimalFormat ff = new DecimalFormat("#.########");
		System.out.println(ff.format(dd));
		
		DecimalFormat fff = new DecimalFormat("0.00000000");
		System.out.println(fff.format(dd));
		
		String srtMsgFm = MessageFormat.format("{0} {1} {2}", 10, 20, 30);
		
	}

}

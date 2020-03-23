package Part_6_Question;

class Printer{
	public static void println(int num) {
		System.out.println(num);
	}
	public static void println(boolean bool) {
		System.out.println(bool);
	}
	public static void println(double num) {
		System.out.println(num);
	}
	public static void println(String str) {
		System.out.println(str);
	}
}

public class Q6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
	}

}

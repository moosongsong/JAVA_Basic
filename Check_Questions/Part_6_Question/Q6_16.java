package Part_6_Question;

class Printer1{
	public void println(int num) {
		System.out.println(num);
	}
	public void println(boolean bool) {
		System.out.println(bool);
	}
	public void println(double num) {
		System.out.println(num);
	}
	public void println(String str) {
		System.out.println(str);
	}
}

public class Q6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer1 printer = new Printer1();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
	}

}

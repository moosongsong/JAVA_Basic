package Part6Main;

class JS{
	static int count;
	
	static {//static ÇÊµå
		System.out.println("static method is running");
		count =0 ;
	}
	
//	static int getNimber() {
//		return kor;
//	}
	
	private int kor;
	private int eng;
	
	public JS() {
		this(50,50);
		System.out.println("constructor is running");
	}
	public JS(int kor, int eng) {
		this.kor=kor;
		this.eng=eng;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return (kor+eng);
	}
	public double getAvg() {
		return this.getTot()/2.0;
//		return ((double)kor+eng/2);
	}
	public void show() {
		System.out.printf("%d, %d, %d, %6.2f", kor, eng, getTot(), getAvg());
		System.out.println("");
	}
}

public class T_TestPage225_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JS j = new JS();
		j.show();
		j.setKor(20);
		j.show();
		//System.out.println(j.getTot());
	}

}

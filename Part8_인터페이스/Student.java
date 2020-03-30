package Part8Maint;

public class Student implements Learnable{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int rank;
	
	public Student(String name, int kor, int eng, int math) {
		this.eng=eng;
		this.kor = kor;
		this.math=math;
		this.name=name;
		this.rank=0;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void show() {
		System.out.println("Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + 
				math + ", rank=" + rank +", Tot="+getTot()+ ", "+(double)getAvg()+"]");
	}
	
	public int getTot() {
		return(kor+math+eng);
	}
	public double getAvg() {
		return (getTot()/3.0);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}
}

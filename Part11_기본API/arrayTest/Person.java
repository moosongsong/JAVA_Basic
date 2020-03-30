package Part11Main.arrayTest;

public class Person implements Comparable<Person>{
	private String name;
	private int kor;
	private int eng;
//	private int total;
	public Person(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
//		total = kor+eng;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public Integer getTotal() {
		return new Integer(kor+eng);
	}

	@Override
	public String toString() {
//		return String.format("%8s %4d %4d %4d %4d %7.2f", name, kor, eng, (kor+eng), (kor+eng)/2);
		return "Person [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + ((kor+eng)/2)+"]";
	}

	@Override
	public int compareTo(Person o) {
		return this.getTotal().compareTo(o.getTotal());
	}
}

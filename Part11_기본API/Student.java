package Part11Main;

public class Student extends Person{
	private String major;
	private int score;
	
	public Student(String name, int age, String major, int score) {
		super(name, age);
		this.major = major;
		this.score = score;
	}

	public String getMajor() {
		return major;
	}

	public int getScore() {
		return score;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String getDescript() {

		StringBuffer st = new StringBuffer();
//		st.append("이름:"+name+"\n");
//		st.append("나이:"+age+"\n");
//		st.append("전공:"+major+"\n");
//		st.append("점수:"+score+"\n");
		
		st.append("이름:"+name+"\n")
		.append("나이:"+age+"\n")
		.append("전공:"+major+"\n")
		.append("점수:"+score+"\n");// 이렇게도 가능하다.
		return st.toString();//반환할때는 자동적으로 문자열화 되지 않는다.
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)==false) {
			return false;
		}
		
		if(!(obj instanceof Student)) {
			return false;
		}
		
		Student temp = (Student)obj;
		
		if(this.major!=null) {
			if(temp.major == null) {
				return false;
			}
			else {
				if(this.major.equals(temp.major)==false) {
					return false;
				}
			}
		}
		
		else {
			if(temp.major!=null) {
				return false;
			}
			else {
				if(this.score!=temp.score) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", score=" + score + "]";
	}
}
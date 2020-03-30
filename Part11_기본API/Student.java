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
//		st.append("�̸�:"+name+"\n");
//		st.append("����:"+age+"\n");
//		st.append("����:"+major+"\n");
//		st.append("����:"+score+"\n");
		
		st.append("�̸�:"+name+"\n")
		.append("����:"+age+"\n")
		.append("����:"+major+"\n")
		.append("����:"+score+"\n");// �̷��Ե� �����ϴ�.
		return st.toString();//��ȯ�Ҷ��� �ڵ������� ���ڿ�ȭ ���� �ʴ´�.
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
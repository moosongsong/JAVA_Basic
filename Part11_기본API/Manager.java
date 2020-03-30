package Part11Main;

public class Manager {
	private Student student;
	
	public Manager(Student student) {
		this.student=student;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Manager==false) {
			return false;
		}
		
		Manager temp = (Manager)obj;
		
		if(this.student!=null) {
			if(temp.student==null) {
				return false;
			}
			else {
				if(this.student.equals(temp.student)==false) {
					return false;
				}
			}
		}
		if(this.student==null) {
			if(temp.student!=null) {
				return false;
			}
			else {
				;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Manager [student=" + student + "]";
	}
}

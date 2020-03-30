package Part11Main;

abstract class Person{
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.age=age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {//인수에 대한 널체크
			return false;
		}
		if(!(obj instanceof Person)) {//타입비교
			return false;
		}
		
		Person po = (Person)obj;
		
//		if(this.name!=null) {//스트링 널체크
//			if(po.name==null) { // 디스=객체 피오 널
//				return false;
//			}
//			else {//디스 객체 피오 객체
//				if(!this.name.equals(po.name)) {
//					return false;
//				}
//			}
//		}
//		else { //디스 멤버가 널
//			if(po.name!=null) {
//				return false;
//			}
//			else {
//				;
//			}
//			if(this.age!=po.age) {
//				return false;
//			}
//			return true;
//		}
//		return true;
		
		if(this.name!=null) {//스트링 널체크
			if(po.name==null) { // 디스=객체 피오 널
				return false;
			}
			else {//디스 객체 피오 객체
				if(this.name.equals(po.name)==false) {
					return false;
				}
			}
		}
		else { //디스 멤버가 널
			if(po.name!=null) {
				return false;
			}
			else {
				if(this.age!=po.age) {
					return false;
				}
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract String getDescript() ;
}
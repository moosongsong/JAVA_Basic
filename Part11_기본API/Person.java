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
		if(obj == null) {//�μ��� ���� ��üũ
			return false;
		}
		if(!(obj instanceof Person)) {//Ÿ�Ժ�
			return false;
		}
		
		Person po = (Person)obj;
		
//		if(this.name!=null) {//��Ʈ�� ��üũ
//			if(po.name==null) { // ��=��ü �ǿ� ��
//				return false;
//			}
//			else {//�� ��ü �ǿ� ��ü
//				if(!this.name.equals(po.name)) {
//					return false;
//				}
//			}
//		}
//		else { //�� ����� ��
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
		
		if(this.name!=null) {//��Ʈ�� ��üũ
			if(po.name==null) { // ��=��ü �ǿ� ��
				return false;
			}
			else {//�� ��ü �ǿ� ��ü
				if(this.name.equals(po.name)==false) {
					return false;
				}
			}
		}
		else { //�� ����� ��
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
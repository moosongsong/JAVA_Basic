package Part11Main;

public class Equal_Object_AppStart {

	public static void main(String[] args) {
	

		Student s = new Student("mem", 20, "wjstks", 90);
		Person p = new Student("mem", 20, "wjstks", 90);
//		Student s2 = new Student("snsn", 21, "ererer", 95);
		
		Object o = new Student("mem", 20, "wjstks", 90);
//		Student s4 = new Student("snsn", 21, "ererer", 95);
		
		Manager m1 = new Manager(new Student("mem", 20, "wjstks", 90));
		Manager m2 = new Manager(new Student("mem", 20, "wjstks", 90));
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		
		System.out.println(s.equals(o));//t
		System.out.println(o.equals(s));//t
		System.out.println(s.equals(p));//t
		
		
//		System.out.println(s2.equals(s4));
		
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println(m1.equals(m2));
	}

}

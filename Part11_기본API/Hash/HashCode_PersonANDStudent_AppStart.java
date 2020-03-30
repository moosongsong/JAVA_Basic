package Part11Main.Hash;

public class HashCode_PersonANDStudent_AppStart {

	public static void main(String[] args) {
		//person 
//		HashCode_Person p1 =new HashCode_Person("meme", 10);
//		HashCode_Person p2 =new HashCode_Person("meme", 10);
//		HashCode_Person p3 = new HashCode_Person("yiyi", 90);
//		//멤버 값이 다른데 같은 값이 나오면 안된다.
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p3.hashCode());
//		
//		System.out.println(p1==p2);
//		System.out.println(p1==p3);
		
//		//student
//		HashCode_Student s1=new HashCode_Student("mem", 20, "wjw", 30.2);
//		HashCode_Student s2=new HashCode_Student("mem", 20, "wjw", 30.2);
//		HashCode_Student s3=new HashCode_Student("me33m", 10, "wjw33", 50.2);
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		
//		//보통의 해시코드
//		HashCode_Student s4=new HashCode_Student("mem", 20, "wjw", 30.2);
//		System.out.println( s4.getClass().getName()+"@"+Integer.toHexString(s4.hashCode()));
		
		//finalize
		HashCode_Student s4=new HashCode_Student("mem", 20, "wjw", 30.2);
		System.out.println( s4.getClass().getName()+"@"+Integer.toHexString(s4.hashCode()));
		s4=null;
		System.gc();
	}

}

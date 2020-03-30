package Part11Main.Hash;

public class HashCode_Person {
//	예제1
//	int number;
//	int number2;
//
//	public HashCode_Person(int number, int number2) {
//		this.number = number;
//		this.number2 = number2;
//	}
//	
//	@Override
//	public int hashCode() {
//		int prime=31;
//		int hash =1;
//		hash=prime*hash +number;
//		hash=prime*hash +number2;
//		return hash;
//	}
	
//	예제2
	String name;
	int age;
	public HashCode_Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		int prime=31;
		int result=1;
		result = prime*result + (name==null? 0: name.hashCode());
		result = prime*result+age;
		return result;
	}
	
	@Override
		protected void finalize() throws Throwable {
			System.out.println("person deconstructor");
			super.finalize();
		}
}

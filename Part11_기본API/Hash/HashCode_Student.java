package Part11Main.Hash;

public class HashCode_Student extends HashCode_Person {
	String major;
	double jumsu;
	
	public HashCode_Student(String name, int age, String major, double jumsu) {
		super(name, age);
		this.major = major;
		this.jumsu = jumsu;
	}
	
	@Override
	public int hashCode() {
		int prime=31;
		int result=1;
		
		result = prime*result+(major==null?0:major.hashCode());
//		result = prime*result+Double.toHexString(jumsu).hashCode();
		result = prime*result+(new Double(jumsu).hashCode());
		result = prime*result+super.hashCode();
		return super.hashCode();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("stduent deconstrictor");
		super.finalize();
	}
}

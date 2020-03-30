package Part11Main.Hash;

public class HashCode_461 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.getClass().getName());
		System.out.println(Integer.toHexString(o1.hashCode()));
		System.out.println(o1);
		System.out.println("========");
		System.out.println(Integer.toHexString(o2.hashCode()));
		System.out.println(o2);
		
	}

}

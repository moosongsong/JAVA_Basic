package Part_9_Question;

interface Vehicle{
	public void run();
}

class Anonymous{
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
				
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}

public class Q9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
				
			}
		});
	}

}

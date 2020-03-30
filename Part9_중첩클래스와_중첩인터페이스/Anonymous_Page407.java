package Part9Main;

class Person{
	void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�.");
	}
}

class Anonymous2{
	Person field = new Person() {
		void work() {
			System.out.println("����� �մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
			}
			
		};
		
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}

public class Anonymous_Page407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous2 annoy = new Anonymous2();
		
		annoy.field.wake();
		
		annoy.method();
		
		annoy.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
			
		});
	}

}

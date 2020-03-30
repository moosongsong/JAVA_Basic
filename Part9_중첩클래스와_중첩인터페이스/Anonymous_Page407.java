package Part9Main;

class Person{
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}

class Anonymous2{
	Person field = new Person() {
		void work() {
			System.out.println("출근을 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
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
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
			
		});
	}

}

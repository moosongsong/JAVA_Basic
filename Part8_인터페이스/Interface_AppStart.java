package Part8Maint;


@FunctionalInterface
interface Calc{
	public abstract int sum(int a, int b);
	//람다식에서는 하나의 추상메소드만 가져야 한다.
	//functional interface 라고 한다.
}

public class Interface_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calc c = new Calc() {
			
//			@Override
//			public int sum(int a, int b) {
//				return a+b;
//			};//클래스 이름이 없어서 이름 지정 못함.
//			//calc를 구현한 인터페이스를 정의 
//			//그래서 여기에 구현 해야해
//			int s =c.sum(10, 20);
//			
			
	//	};
		
		Calc c2 = (a,b)->{
			return (a+b);
		};
		int s =c2.sum(10, 20);
	}

}

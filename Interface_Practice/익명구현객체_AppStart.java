package Interface_Practice;

interface Fightable{
	void fight();
}

abstract class Eatable{
	abstract void eat();
}

public class ÀÍ¸í±¸Çö°´Ã¼_AppStart {

	public static void main(String[] args) {
		
//		Love lo = new Love() {
//			public void run() {
//				for (int i = 0; i < 100	; i++) {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						// TODO: handle exception
//					}
//					System.out.println(Thread.currentThread());
//				}
//			}
//		};
//		new Thread(run).start();
		
		// TODO Auto-generated method stub
		Fightable fighter = new Fightable() {
			public void cry() {
				System.out.println("¾û¾û");
			}
			@Override
			public void fight() {
				System.out.println("¸ÂÂ¯");
				cry();
				
			}
		};
		
		Eatable eat = new Eatable() {
			
			@Override
			void eat() {
				System.out.println("ÃÄ¹¬");
			}
		};
		
		fighter.fight();
		
		eat.eat();
	}

}

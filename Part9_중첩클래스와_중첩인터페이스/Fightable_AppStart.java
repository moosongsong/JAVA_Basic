package Part9Main;

public class Fightable_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fightable fighter = new Fightable() {
			
			@Override
			public void fight() {
				// TODO Auto-generated method stub
				System.out.println("fight");
			}
		};
		
		fighter.fight();
		
		
		
		(new Fightable() {	
			@Override
			public void fight() {
				// TODO Auto-generated method stub
				System.out.println("fight");
			}
		}).fight();//요렇게 사용해도 됨.
	}

}

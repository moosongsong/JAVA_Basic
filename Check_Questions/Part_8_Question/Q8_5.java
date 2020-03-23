package Part_8_Question;

interface Action{
	void work();
}

public class Q8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
		};
		action.work();
	}

}

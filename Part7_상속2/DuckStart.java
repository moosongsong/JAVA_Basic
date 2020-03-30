package Part7_AbstractPractice;

import Part7_AbstractPractice.Mallereduck;
import Part7_AbstractPractice.Duck;

public class DuckStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d =new Mallereduck();
		d.fly();
		
		Duck r =new RubberDuck();
		r.fly();
		
		//객체 수집이 가능해진다. 마치 상속처럼
		//벗 자식클래스에서 메소드를 반드시 구현해야만함.
		//즉 그룹화가 가능해지는 것이다.
		//구현을 강제하는 역할
		//큰의미적으로 본다면, 그루핑, (우리 그룹에 들어오려면 날아야 하는데, 나는건 니 알아서 하셈.)
	}

}

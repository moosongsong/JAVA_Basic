package Part11Main;

public class 스트링버퍼연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("하나").append("둘").append("셋");//메소드 체이닝 기법
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}

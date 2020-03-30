package Part2Main;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2=v1-10;
		}
		int v3 = v1+5;//+v2 변수 사용 불가 컴파일 에러
		System.out.println(v3);
	}

}

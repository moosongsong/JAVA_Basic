package Part2Main;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2=v1-10;
		}
		int v3 = v1+5;//+v2 ���� ��� �Ұ� ������ ����
		System.out.println(v3);
	}

}

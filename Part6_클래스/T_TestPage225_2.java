package Part6Main;

public class T_TestPage225_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = {1,2,4};
		for (int i = 0; i < a.length; i++) {
			a[i]+=10;//a[i]=a[i]+10 �̹Ƿ� ����ϰ� �ٽ� a[i]�־��� ��� ��!
			//ȥ������ ����
		}
		for (Integer integer : a) {
			integer += 10;//integer = integer + 10 //���� ������� �ų�
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

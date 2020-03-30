package Part6Main;

public class T_TestPage225_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = {1,2,4};
		for (int i = 0; i < a.length; i++) {
			a[i]+=10;//a[i]=a[i]+10 이므로 계산하고 다시 a[i]넣어줘 라는 뜻!
			//혼동하지 말것
		}
		for (Integer integer : a) {
			integer += 10;//integer = integer + 10 //새로 만들어진 거네
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
